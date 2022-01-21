def ssh(){

IP=$1
USERNAME=$2

echo "We are going to ssh into $IP with $USERNAME

ssh $USERNAME@$IP
echo $?
}
