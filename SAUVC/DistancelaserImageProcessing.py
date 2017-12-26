## program written by Shane Ormonde 7th sept 2013
## updated on 25th January 2014
## program re-forked by Kingshuk at 2017 November 20
## calculates the distance of a red dot in the field of view of the webcam.

import cv2
from numpy import *
import math

# variables
loop = 1
dot_dist = 0

cv2.namedWindow("preview")
vc = cv2.VideoCapture(1)

if vc.isOpened():  # try to get the first frame
    rval, frame = vc.read()

else:
    rval = False
    # print "failed to open webcam"

if rval == 1:

    while loop == 1:
        cv2.imshow("preview", frame)
        rval, frame = vc.read()
        key = cv2.waitKey(20)
        if key == 27:  # exit on ESC
            loop = 0
        num = (frame[..., 2] > 236)
        xy_val = num.nonzero()

        y_val = median(xy_val[0])
        x_val = median(xy_val[1])

        # dist = ((x_val - 320)**2 + (y_val - 240)**2 )**0.5 # distance of dot from center pixel
        dist = abs(x_val - 320)  # distance of dot from center x_axis only

        print " dist from center pixel is " + str(dist)
        #cv2.putText(frame, "the dot is " + str(dist) + "cm  away", (int(x_val+ 40), int(y_val - 60)),
        #            cv2.FONT_HERSHEY_SIMPLEX, 0.55, (0, 0, 255), 2)

        # work out distance using D = h/tan(theta)

        theta = 0.0011450 * dist + 0.0154
        tan_theta = math.tan(theta)

        if tan_theta > 0:  # bit of error checking
            obj_dist = int(7 / tan_theta)


        print "\033[12;0H" + "the dot is " + str(obj_dist) + "cm  away"
        cv2.putText(frame, "the dot is " + str(obj_dist) + "cm  away", (int(x_val), int(y_val - 40)),
                    cv2.FONT_HERSHEY_SIMPLEX, 0.55, (0, 255, 0), 2)
elif rval == 0:
    print " webcam error "