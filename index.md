<h1 align="center">
  <img src="images/priam.png" alt="Priam Logo" />
</h1>

# Table Of Contents

## [TL;DR;](#tldr)

1. [Requirements](#requirements)

1. [Compatibility](#compatibility)

## [Installation](docs/installation.html)

## Management Tasks
1. [Token Management](docs/tokenmanagement.html)

1. [Cassandra Tuning](docs/cassandratuning.html)

1. [Cassandra REST API](docs/cassandrarestapi.html)

1. [Backups](docs/backups.html)

1. [Restore](docs/restore.html)

1. [Compaction](docs/compaction.html)

1. [Flush](docs/flush.html)

1. [Health](docs/health.html)

1. [Configuration](docs/configuration.html)

1. [Metrics](docs/metrics.html)

## [Contributions](docs/contributions.html)

## [Presentations](docs/presentations.html)

## [FAQ](faq/faq.html)

## [Authors](#authors)


Priam is a process/tool that runs alongside [Apache Cassandra]
(http://cassandra.apache.org), a highly available, column-oriented database.
Priam automates the following tasks:

* Backup and recovery (Complete and incremental)
* Token management
* Seed discovery
* Configuration

The name 'Priam' refers to the King of Troy in Greek mythology, who was the
father of Cassandra. Priam is actively developed and used at Netflix since
mid-2011.

## Features

* Token management using SimpleDB
* Support for multi-region Cassandra deployment in AWS via public IP.
* Automated security group update in multi-region environment.
* Backup SSTables from local disks to S3.
  - Snappy compression for backup data
  - Throttling
* Pluggable modules for future enhancements (support for multiple data storage).
* REST APIs for backup/restore and other operations
* REST APIs for validating backups.
* Monitoring of Cassandra health
* Auto-remediation of common issues

## Requirements

* AWS cloud
* EC2 instances deployed in an an Auto Scaling Group (ASG)
* Single-token Cassandra nodes

## Compatibility

|Priam Branch|Cassandra Version |Description                    | Javadoc     |
|------------|------------------|-------------------------------|-------------|
|[4.x]       | C* 4.x           | Alpha: Supports Apache C* 4.x | [4.x-docs]  |
|[3.11]      | C* 3.x           | Supports Apache C* 3.x        | [3.11-docs] |
|[3.x]       | C* 2.1.x         | Any minor version of Apache C* 2.1.x and DSE
| [3.x-docs] |

[4.x](https://github.com/Netflix/Priam/tree/4.x)
[3.11](https://github.com/Netflix/Priam/tree/3.11)
[3.x](https://github.com/Netflix/Priam/tree/3.x)
[4.0-docs](https://www.javadoc.io/doc/com.netflix.priam/priam/4.0.0-alpha7)
[3.11-docs](https://www.javadoc.io/doc/com.netflix.priam/priam/3.11.35)
[3.x-docs](https://www.javadoc.io/doc/com.netflix.priam/priam/3.1.65)

# Authors
1. Arun Agrawal @arunagrawal84
2. Joseph Lynch @jolynch
3. Vinay Chella @vinaykumarchella

# License
Copyright 2011-2018 Netflix, Inc.

Licensed under the Apache License, Version 2.0 (the “License”); you may not use
this file except in compliance with the License. You may obtain a copy of the
License at

(http://www.apache.org/licenses/LICENSE-2.0)

Unless required by applicable law or agreed to in writing, software distributed
under the License is distributed on an “AS IS” BASIS, WITHOUT WARRANTIES OR
CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

A Netflix Original Production

[Netflix OSS](http://netflix.github.io/#repo) | [Tech
Blog](https://medium.com/netflix-techblog) | [Twitter
@NetflixOSS](https://twitter.com/NetflixOSS) |
[Jobs](https://jobs.netflix.com/)
