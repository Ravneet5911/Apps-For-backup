
class Assignment {
    func fibonacci(n: Int) {
    
    var a=0
    var b=1
    var arr = [a, b]
    for _ in 1...n-2 {
        let temp = a+b
        a = b
        b = temp
        arr.append(b)
    }
    print(arr)
    }
}
var ass = Assignment()
ass.fibonacci(n: 5)
