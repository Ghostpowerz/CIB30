<?php

error_reporting(E_ALL);
ini_set('display_errors', 'On');

$username = "s5068790_y1";                  // Use your username
$password = "password1998";             // and your password
$database = "computing.bournemouth.ac.uk:1521/decprd";   // and the connect string to connect to your database

$query = 'SELECT * FROM EMPLOYEE ';

$c = oci_connect($username, $password, $database);
if (!$c) {
    $m = oci_error();
    trigger_error('Could not connect to database: '. $m['message'], E_USER_ERROR);
}

$s = oci_parse($c, $query);
if (!$s) {
    $m = oci_error($c);
    trigger_error('Could not parse statement: '. $m['message'], E_USER_ERROR);
}
$r = oci_execute($s);
if (!$r) {
    $m = oci_error($s);
    trigger_error('Could not execute statement: '. $m['message'], E_USER_ERROR);
}


// Fetch each row in an associative array
print '<table border="1">';
while ($row = oci_fetch_array($s, OCI_RETURN_NULLS+OCI_ASSOC)) {
   print '<tr>';
   foreach ($row as $item) {
       print '<td>'.($item !== null ? htmlentities($item, ENT_QUOTES) : '&nbsp').'</td>';
   }
   print '</tr>';
}

?>
