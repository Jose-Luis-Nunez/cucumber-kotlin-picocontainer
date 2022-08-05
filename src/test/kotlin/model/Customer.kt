package model

class Customer(
    private var name: String
) {
    private var refund: Int = 0

    fun refund(refund: Int) {
        this.refund = refund
    }

    fun getRefunded(): Int {
        return refund
    }

    override fun toString(): String {
        return "name: $name , refund: $refund"
    }
}
