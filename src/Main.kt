fun main(){
    val transactionCode = 4
    when (transactionCode) {
        1 -> println("Processing Deposit....")
        2 -> println("Processing Withdrawal....")
        3 -> println("Checking Balance....")
        else -> println("Invalid Code. Please try again")
    }
}