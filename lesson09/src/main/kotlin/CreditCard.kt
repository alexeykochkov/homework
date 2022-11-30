class CreditCard (balance: Int, creditLimit: Int): BankCard (balance) {
    var creditLimit_ = creditLimit
    var credit = creditLimit
    val maxCreditLimit = 1000
    init {
        balance_ = balance
        creditLimit_ = creditLimit
    }
          override fun addBalance() {
//          super.addBalance()
          val addMoney = 1000
          if (creditLimit_ <= credit) {
            creditLimit_ = (creditLimit_ + addMoney) - credit
          }
          if (creditLimit_ == maxCreditLimit) {
            balance_ = balance_ + addMoney
          }
          if (creditLimit_ >= maxCreditLimit) {
              balance_ = (addMoney - ((creditLimit_ + addMoney) - credit)) + balance_
          }
      }


}
//    var CREDITLIMIT = 500
//
//
//    init {
//        balance_ = balance
//
//    }
//      override fun addBalance() {
////          super.addBalance()
//          val addMoney = 600
//          if (CREDITLIMIT <= 0) {
//            CREDITLIMIT = CREDITLIMIT + addMoney
//          }
//          if (CREDITLIMIT == 500) {
//            balance_ = balance_ + addMoney
//          }
//          if (CREDITLIMIT > 500) {
//              balance_ = (CREDITLIMIT - 500) + balance_
//          }
//      }
//    }
//    override fun pay (): Boolean {
//        super.pay()
//
//    }
