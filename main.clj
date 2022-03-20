; Retrieve the first element of the list
; John has received his grades for [Math, Science, English, PE, History]
; Evaluate John's grade for Math if either he failed or passed

; Declaring a variable and assigning it to a list
(def John (first (list 75, 91, 79, 88, 79)))

; Simple conditional statement for evaluation
(println John(cond
    (< John 75)  "Failed"
    (< John 76) "Barely Passed"
    :else  "PASSED"))
