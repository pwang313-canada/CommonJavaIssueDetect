# Memory Leak Detection

Some examples demonstrating how to detect and memory leak issues caused by multithreaded Java applications.

## How to Use

### 1. Download JDK Mission Control (JMC) 

Download JDK Mission Control (JMC) latest version:<br>
https://www.oracle.com/java/technologies/javase/products-jmc9-downloads.html

### 2. Run your Java application

Start your Java program using IntelliJ IDEA or from the command line.

### 3. Use JMC

Open Process Explorer and locate the process with high CPU usage.

<ul>
<li>Identify the PID of the process</li>

<li>Double-click the process</li>

<li>Go to the Threads tab to find the thread ID (TID) consuming high CPU</li>
</ul>

![high_cpu.png](resources/high_cpu.png)
### 4, Analyze with jstack
Use jstack with the PID to identify the specific Java code causing the high CPU usage.
Match the thread ID (TID) from Process Explorer with the thread dump to pinpoint the problem.

1. Start jstack with PID (27612)
    - jstack -l 27612
   

2. Search NID (41036) from output
![nid_found.png](resources/nid_found.png)


3. find the issue line
![issue_line.png](resources/issue_line.png)


## Future Enhancements
<li>Add automated monitoring scripts

<li>Provide examples of common high-CPU patterns

<li>Include performance optimization techniques

## Contributing

Contributions are welcome! Feel free to open issues or submit pull requests.

## License

[MIT License](LICENSE)

---

Made with ❤️ for Spring Boot developers