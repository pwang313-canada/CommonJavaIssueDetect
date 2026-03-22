# Thread Dead Lock Detection

An example demonstrating how to detect thread dead lock caused by multi-threaded Java applications.

## How to Use

### 1. Run your java application
either from intellij or command line

### 2. Start JConsole from java bin folder

select the java you want to check
![jconsole_start.png](resources/jconsole_start.png)


### 3. Find any deadlock thread by name, and check the java code 
![dead_lock_found.png](resources/dead_lock_found.png)

java code
![source_code.png](resources/source_code.png)

### 4. Alternate way to find deadlock
Run VisualVm and load Java application

Click `Threads` tab

Click `Thread Dump`

![virsual_deadlock.png](resources/virsual_deadlock.png)

Search `BLOCKED`
![visualvm_result.png](resources/visualvm_result.png)



## Contributing

Contributions are welcome! Feel free to open issues or submit pull requests.

---

Made with ❤️ for Spring Boot developers