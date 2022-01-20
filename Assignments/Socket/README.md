## _SOCKET PROGRAMMING_
Socket programming is a means of communicating data between two computers across a network. Connections can be made using either a connection-oriented protocol or a connectionless protocol. In our case, we will use TCP/IP which is a connection-oriented protocol.

## _SOCKET_
A socket is a communication endpoint that serves as a link between two machines on a network. It has a port number, which the TCP/IP layer can use to identify the application that receives the data. An endpoint usually includes a port number and an IP address.

## _Java Socket_
Java Socket programming is used for communication between the applications running on different JRE.

Java Socket programming can be connection-oriented or connection-less.

The client in socket programming must know two information:
- IP Address of Server, and
- Port number.

Here, we are going to make one-way client and server communication. In this application, client sends a message to the server, server reads the message and prints it.

