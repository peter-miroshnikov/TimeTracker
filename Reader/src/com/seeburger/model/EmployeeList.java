//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.07.18 at 10:32:30 AM EEST
//

package com.seeburger.model;


import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for anonymous complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Employee" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="employeeInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="enterDateList">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="enter" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="enterDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="floor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="exitDateList">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="exit" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="exitDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="floor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"employee"})
@XmlRootElement(name = "EmployeeList")
public class EmployeeList
{

    @XmlElement(name = "Employee", required = true)
    protected List<EmployeeList.Employee> employee;


    /**
     * Gets the value of the employee property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification
     * you make to the returned list will be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the employee property.
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getEmployee().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link EmployeeList.Employee }
     */
    public List<EmployeeList.Employee> getEmployee()
    {
        if (employee == null)
        {
            employee = new ArrayList<EmployeeList.Employee>();
        }
        return this.employee;
    }


    public Employee getEmployeeByName(String name)
    {
        if (employee == null)
        {
            employee = new ArrayList<Employee>();
        }
        for (int i = 0; i < employee.size(); i++)
        {
            if (employee.get(i).getEmployeeInfo().getName().equals(name))
            {
                return employee.get(i);
            }
        }
        return null;
    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * <p>
     * The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="employeeInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="enterDateList">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="enter" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="enterDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="floor" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="exitDateList">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="exit" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="exitDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="floor" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"employeeInfo", "enterDateList", "exitDateList"})
    public static class Employee
    {

        @XmlElement(required = true)
        protected EmployeeList.Employee.EmployeeInfo employeeInfo;
        @XmlElement(required = true)
        protected EmployeeList.Employee.EnterDateList enterDateList;
        @XmlElement(required = true)
        protected EmployeeList.Employee.ExitDateList exitDateList;


        /**
         * Gets the value of the employeeInfo property.
         *
         * @return possible object is {@link EmployeeList.Employee.EmployeeInfo }
         */
        public EmployeeList.Employee.EmployeeInfo getEmployeeInfo()
        {
            return employeeInfo;
        }


        /**
         * Sets the value of the employeeInfo property.
         *
         * @param value allowed object is {@link EmployeeList.Employee.EmployeeInfo }
         */
        public void setEmployeeInfo(EmployeeList.Employee.EmployeeInfo value)
        {
            this.employeeInfo = value;
        }


        /**
         * Gets the value of the enterDateList property.
         *
         * @return possible object is {@link EmployeeList.Employee.EnterDateList }
         */
        public EmployeeList.Employee.EnterDateList getEnterDateList()
        {
            return enterDateList;
        }


        /**
         * Sets the value of the enterDateList property.
         *
         * @param value allowed object is {@link EmployeeList.Employee.EnterDateList }
         */
        public void setEnterDateList(EmployeeList.Employee.EnterDateList value)
        {
            this.enterDateList = value;
        }


        /**
         * Gets the value of the exitDateList property.
         *
         * @return possible object is {@link EmployeeList.Employee.ExitDateList }
         */
        public EmployeeList.Employee.ExitDateList getExitDateList()
        {
            return exitDateList;
        }


        /**
         * Sets the value of the exitDateList property.
         *
         * @param value allowed object is {@link EmployeeList.Employee.ExitDateList }
         */
        public void setExitDateList(EmployeeList.Employee.ExitDateList value)
        {
            this.exitDateList = value;
        }

        /**
         * <p>
         * Java class for anonymous complex type.
         * <p>
         * The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"name", "id"})
        public static class EmployeeInfo
        {

            @XmlElement(required = true)
            protected String name;
            protected int id;


            /**
             * Gets the value of the name property.
             *
             * @return possible object is {@link String }
             */
            public String getName()
            {
                return name;
            }


            /**
             * Sets the value of the name property.
             *
             * @param value allowed object is {@link String }
             */
            public void setName(String value)
            {
                this.name = value;
            }


            /**
             * Gets the value of the id property.
             */
            public int getId()
            {
                return id;
            }


            /**
             * Sets the value of the id property.
             */
            public void setId(int value)
            {
                this.id = value;
            }

        }

        /**
         * <p>
         * Java class for anonymous complex type.
         * <p>
         * The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="enter" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="enterDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="floor" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"enter"})
        public static class EnterDateList
        {

            @XmlElement(required = true)
            protected List<EmployeeList.Employee.EnterDateList.Enter> enter;


            /**
             * Gets the value of the enter property.
             * <p>
             * This accessor method returns a reference to the live list, not a snapshot. Therefore any
             * modification you make to the returned list will be present inside the JAXB object. This is why
             * there is not a <CODE>set</CODE> method for the enter property.
             * <p>
             * For example, to add a new item, do as follows:
             *
             * <pre>
             * getEnter().add(newItem);
             * </pre>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link EmployeeList.Employee.EnterDateList.Enter }
             */
            public List<EmployeeList.Employee.EnterDateList.Enter> getEnter()
            {
                if (enter == null)
                {
                    enter = new ArrayList<EmployeeList.Employee.EnterDateList.Enter>();
                }
                return this.enter;
            }

            /**
             * <p>
             * Java class for anonymous complex type.
             * <p>
             * The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="enterDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="floor" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {"enterDate", "floor"})
            public static class Enter
            {

                @XmlElement(required = true)
                protected String enterDate;
                protected int floor;


                /**
                 * Gets the value of the enterDate property.
                 *
                 * @return possible object is {@link String }
                 */
                public String getEnterDate()
                {
                    return enterDate;
                }


                /**
                 * Sets the value of the enterDate property.
                 *
                 * @param value allowed object is {@link String }
                 */
                public void setEnterDate(String value)
                {
                    this.enterDate = value;
                }


                /**
                 * Gets the value of the floor property.
                 */
                public int getFloor()
                {
                    return floor;
                }


                /**
                 * Sets the value of the floor property.
                 */
                public void setFloor(int value)
                {
                    this.floor = value;
                }

            }

        }

        /**
         * <p>
         * Java class for anonymous complex type.
         * <p>
         * The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="exit" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="exitDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="floor" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"exit"})
        public static class ExitDateList
        {

            @XmlElement(required = true)
            protected List<EmployeeList.Employee.ExitDateList.Exit> exit;


            /**
             * Gets the value of the exit property.
             * <p>
             * This accessor method returns a reference to the live list, not a snapshot. Therefore any
             * modification you make to the returned list will be present inside the JAXB object. This is why
             * there is not a <CODE>set</CODE> method for the exit property.
             * <p>
             * For example, to add a new item, do as follows:
             *
             * <pre>
             * getExit().add(newItem);
             * </pre>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link EmployeeList.Employee.ExitDateList.Exit }
             */
            public List<EmployeeList.Employee.ExitDateList.Exit> getExit()
            {
                if (exit == null)
                {
                    exit = new ArrayList<EmployeeList.Employee.ExitDateList.Exit>();
                }
                return this.exit;
            }

            /**
             * <p>
             * Java class for anonymous complex type.
             * <p>
             * The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="exitDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="floor" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {"exitDate", "floor"})
            public static class Exit
            {

                @XmlElement(required = true)
                protected String exitDate;
                protected int floor;


                /**
                 * Gets the value of the exitDate property.
                 *
                 * @return possible object is {@link String }
                 */
                public String getExitDate()
                {
                    return exitDate;
                }


                /**
                 * Sets the value of the exitDate property.
                 *
                 * @param value allowed object is {@link String }
                 */
                public void setExitDate(String value)
                {
                    this.exitDate = value;
                }


                /**
                 * Gets the value of the floor property.
                 */
                public int getFloor()
                {
                    return floor;
                }


                /**
                 * Sets the value of the floor property.
                 */
                public void setFloor(int value)
                {
                    this.floor = value;
                }

            }

        }

    }

}