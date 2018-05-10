<!doctype html>

<html lang="en">

    <head>
        <meta charset="utf-8">
        <title>Search Report</title>
        <meta name="description" content="Our main homepage.">
        <meta name="author" content="Ieuan Burton,Donato De Nicola">
        <link rel="stylesheet" href="../bootstrap/css/bootstrap.min.css">
    </head>
    <body>
        <!-- ============ HEADER SECTION ============== -->
        <div id="header">
        </div>
        <!-- ============ NAVIGATION BAR SECTION ============== -->
        <nav class="navbar navbar-expand-sm bg-light navbar-light">
            <!-- Brand/logo -->
            <a class="navbar-brand" href="#">
                <img src="../imgs/kingfisher.png" alt="logo" style="width:200px;height:50px">
            </a>
            <!-- Links -->
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="https://www.kingfisher.com/index.asp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="https://www.kingfisher.com/index.asp?pageid=2">About us</a>
                </li>
            </ul>
            <div id="navbarNavDropdown" class="navbar-collapse collapse">
                <ul class="navbar-nav mr-auto">
                </ul>
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="../login.html">Log Out</a>
                    </li>
                </ul>
            </div>
        </nav>
        <!-- ============ MAIN CONTENT SECTION ============== -->
        <div class="container">
            <form class="form-horizontal">
                <fieldset>
                    <!-- Text input-->
                    <section id="cover">
                        <div id="cover-caption">
                            <div id="container" class="container">
                                <div class="row text-white">
                                    <div class="col-sm-10 offset-sm-1 text-center">
                                        <h1 class="display-3">Search Report</h1>
                                        <div class="info-form">
                                            <form action="" class="form-inline justify-content-center">
                                                <div class="form-group">
                                                      <table>
                                                          <tr>
                                                              <th>Project ID</th>
                                                              <th>Employee ID</th>
                                                              <th>Employee Name</th>
                                                              <th>Time Expected</th>
                                                              <th>Overtime</th>
                                                          </tr>
                                                          <tr>
                                                              <th>100810</th>
                                                              <th>10039</th>
                                                              <th>William Evans</th>
                                                              <th>40</th>
                                                              <th>5</th>
                                                          </tr>
                                                          <tr>
                                                              <th>100810</th>
                                                              <th>10079</th>
                                                              <th>Laura Davis</th>
                                                              <th>45</th>
                                                              <th>6</th>
                                                          </tr>
                                                          <tr>
                                                              <th>100810</th>
                                                              <th>10042</th>
                                                              <th>Scott Walters</th>
                                                              <th>30</th>
                                                              <th>10</th>
                                                          </tr>
                                                          <tr>
                                                              <th>100810</th>
                                                              <th>10052</th>
                                                              <th>Charlie Gray</th>
                                                              <th>52</th>
                                                              <th>9</th>
                                                          </tr>
                                                    </table>
                                                    <button onclick="exportTableToCSV('timesheet.csv')" class="btn btn-success" type="button">Download .CVS file</button>
                                                    <button onclick="exportTableToXML('timesheet.xml')" class="btn btn-success" type="button">Download .XML file</button>
                                                </div>
                                            </form>
                                        </div>
                                        <br>
                                        <a href="../adminClockin-out.html" class="btn btn-success" role="button">Clock In/Out</a>
                                        <a href="../assignment.html" class="btn btn-success" role="button">Assignment</a>
                                        <a href="../approvalPage.html" class="btn btn-success" role="button">Timesheet Review</a>
                                        <a href="../reportSearch.html" class="btn btn-success" role="button">Search Report</a>
                                        <br>
                                        <br>
                                        <a href="../login.html" class="btn btn-success" role="button">Exit/Log Out</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </section>
                    <!-- ============ FOOTER SECTION ============== -->
                    <div class="footer">
                        <p><img src="../imgs/kingfisher.png" alt="logo" style="width:100px;height:25px"> © Kingfisher plc 2018, Company number 01664812. Registered in England, 3 Sheldon Square, Paddington, London, W2 6PX</p>
                    </div>
                    <script src="../clockin-outJS.js"> </script>
                    </body>
                </html>
