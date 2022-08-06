package example2.model2

open class Customer {
    private var name: String = ""
    private var refund: Int = 0

    fun getName(): String {
        return name
    }

    fun setName(name: String?) {
        this.name = name!!
    }

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
