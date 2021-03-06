DROP TABLE IF EXISTS `etjob`;
CREATE TABLE `etjob` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `city` varchar(255) NOT NULL,
  `jobType` varchar(255) NOT NULL,
  `expectJob` varchar(255) NOT NULL,
  `expectSal` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


ALTER TABLE resume ADD wsid int NULL;
ALTER TABLE resume ADD wrid int NULL;
ALTER TABLE resume ADD pid int NULL;
ALTER TABLE resume ADD eid int NULL;
ALTER TABLE resume DROP WANGTEDJOB;
ALTER TABLE resume DROP WANGTEDSAL;
ALTER TABLE resume DROP COMPANY_NAME;
ALTER TABLE resume DROP JOBNAME;
ALTER TABLE resume DROP WORKBEGIN_YEAR;
ALTER TABLE resume DROP WORKBEGIN_MONTH;
ALTER TABLE resume DROP WORKEND_YEAR;
ALTER TABLE resume DROP WORKEND_MONTH;
ALTER TABLE resume DROP SCOOLNAME;
ALTER TABLE resume DROP EDUCATION_BACKGROUND;
ALTER TABLE resume DROP MAJOR;
ALTER TABLE resume DROP EDUBEGIN_YEAR;
ALTER TABLE resume DROP EDUEND_YEAR;

ALTER TABLE resume
ADD CONSTRAINT resume_edu_record_eid_fk
FOREIGN KEY (eid) REFERENCES edu_record (eid);
ALTER TABLE resume
ADD CONSTRAINT resume_project_record_pid_fk
FOREIGN KEY (pid) REFERENCES project_record (pid);
ALTER TABLE resume
ADD CONSTRAINT resume_work_show_wsid_fk
FOREIGN KEY (wsid) REFERENCES work_show (wsid);
ALTER TABLE resume
ADD CONSTRAINT resume_work_record_wid_fk
FOREIGN KEY (wrid) REFERENCES work_record (wid);
