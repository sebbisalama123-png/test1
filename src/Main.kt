fun main(){
    val transactionCode = 4
    when (transactionCode) {
        1 -> println("Processing Deposit....")
        2 -> println("Processing Withdrawal....")
        3 -> println("Checking Balance....")
        4 -> println("Checking Token...")
        else -> println("Invalid Code. Please try again")
    }
}