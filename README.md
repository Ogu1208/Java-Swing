# Java-Swing
Java의 Swing을 이용한 GUI 프로그램을 제작하기 위해 공부하는 repo입니다. <br>
This is a repo to study to make a GUI program using Java's Swing.
Please check the code for details.

I write this README.md in English to practice and improve my writing skills in English.
If there's any problem with expression or grammar, let me know. Thank you :D




## :pager: SwingDemo - Frame Study List> 


 ### :bulb: MainFrame 
  Youtube url : https://www.youtube.com/watch?v=aIdIXsi1qTU <br>

  <details>
    <summary> Result </summary>
 
  ![image](https://github.com/Ogu1208/Java-Swing/assets/76902448/505ed275-06d0-437a-b6d4-0c0324632ffe)
  </details>

  
  ----

###  :bulb: Java GUI: Full Course ☕ (FREE)  - Bro Code

  Youtube url : [https://www.youtube.com/watch?v=aIdIXsi1qTU](https://www.youtube.com/watch?v=Kmgo00avvEw) <br>
   > #### If you want to apply a kind of Listeners, you should declare the valuables **global** that you want to.

 
  <details>
  <summary> 📁 Frames </summary>
 
 ### JFrame = a GUI window to add components to
  
  ![image](https://github.com/Ogu1208/Java-Swing/assets/76902448/6567febc-87ea-41c8-9a7d-fe24bae5fe83)
  
  </details>
  
  <details>
  <summary> 📁 labels </summary>
 
 ### JLabel = a GUI display area for a string of text, an image, or both

  ![image](https://github.com/Ogu1208/Java-Swing/assets/76902448/8cf4dd09-f6d2-4dcd-8c73-15f35022e9cb)
  
  </details>
  
  <details>
  <summary> 📁 panels </summary>
  
![image](https://github.com/Ogu1208/Java-Swing/assets/76902448/53b974b0-bc06-4535-8d7a-c74588bd9d52)
  
  </details>
  
  
  <details>
  <summary> 📁 Buttons </summary>
 
  ###  JButton = a button that performs an action when clicked on
 
![image](https://github.com/Ogu1208/Java-Swing/assets/76902448/a5daed4d-45a2-429b-8f5b-f4fadd60b08a)


  
  </details>
  
  
  
  <details>
  <summary> 📁 BorderLayout </summary>
  
![image](https://github.com/Ogu1208/Java-Swing/assets/76902448/0f6dcb6b-086b-422f-a6a0-6b95646643ec)
  
  </details>
  
  
  <details>
  <summary> 📁 FlowLayout </summary>
   <br>
 
  > Layout Manager = Defines the natural layout for components within a container
 
  왼쪽에서 오른쪽으로 배치되며 오른쪽에 더 이상 공간이 없으면 다음 줄로 자동 배치되는 게 특징입니다. 일반적으로 플로우 레이아웃은 패널에 버튼을 배열하는 데 사용되며, 기본적으로 가운데 정렬입니다. <br>
They are laid out from left to right and automatically move to the next line when there is no more space on the right. <br>
 A flow layout is generally used to arrange buttons in a panel, center aligned by default.
 
 ![image](https://github.com/Ogu1208/Java-Swing/assets/76902448/f68120c2-59d1-4e60-9aaa-8ec26acc0907)

  </details>
  
  <details>
  <summary> 📁 GridLayout </summary>
  <br>
 
  > Layout Manager = Defines the natural layout for components within a container

   ### GridLayout = places components in a grid of cells.
   Each component takes all the available space within its cell, and each cell is the same size
 
 ![image](https://github.com/Ogu1208/Java-Swing/assets/76902448/950519f7-66d7-4eec-9bb0-52c28870049a)


  </details>
  
  <details>
  <summary> 📁 JLayeredPane </summary>
   <br>

   ### JLayeredPane = Swing container that provides a third dimention for positioning components ex. depth, Z-index
 
  ![image](https://github.com/Ogu1208/Java-Swing/assets/76902448/aec2714a-42e3-48b6-b46c-1fe2d2f216ff)
 ![image](https://github.com/Ogu1208/Java-Swing/assets/76902448/a9ef6892-9103-43cb-8257-1a361fcf04c4)


   </details>
   
   <details>
   <summary> 📁 Open a New Window </summary>

  ![image](https://github.com/Ogu1208/Java-Swing/assets/76902448/f53320fe-aba6-46c5-8ab5-580f03c75c97)
  ![image](https://github.com/Ogu1208/Java-Swing/assets/76902448/e3057cf3-5dac-4044-8497-a8856a965ead)

  </details>
  
  <details>
  <summary> 📁 JOptionPane </summary>

 ### JOptionPane = pop up a standard dialog box that prompts users for a value or informs them of something

 [tistory - JOptionPane 자주 쓰는 메소드 정리](https://shin-01.tistory.com/34)
 
![image](https://github.com/Ogu1208/Java-Swing/assets/76902448/b9ccd609-c424-4f0f-a7d4-6453f822b663)

  </details>

  <details>
  <summary> 📁 textField </summary>
 
![image](https://github.com/Ogu1208/Java-Swing/assets/76902448/0ae13ec1-e04f-4222-b498-2fa9a7472d6a)

  </details>


  <details>
  <summary> 📁 checkBox </summary>
 
 ### JCheckBox = a GUI component that cat be selected or deselected
 
  Set the Icon of the checkbox.
  If checkbox is selected, the icon changes to the other. You can do so by using  the method `setSelectedSIcon()`.
 
 ![image](https://github.com/Ogu1208/Java-Swing/assets/76902448/4867eb1d-77ab-40bc-ab72-ae9b57667907)

  </details>
  
  <details>
  <summary> 📁 radio buttons </summary>
 
 ### JRadioButton = One or more buttons in a grouping in which only 1 may be selected per group
 
We can limit the choice selection to only one item by putting them within the same grouping. <br>
To do so, use `ButtonGroup` and add the items to it.
 
  ![image](https://github.com/Ogu1208/Java-Swing/assets/76902448/468076e9-d112-44eb-90fd-f84b6a76ce40)

  </details>
  
  <details>
  <summary> 📁 combo boxes </summary>
 
 ### JcomboBox = A component that combines a button or editable field and a drop-down list
 
You should use the `wrapper class` if you need to store a permitted type.
 
![image](https://github.com/Ogu1208/Java-Swing/assets/76902448/ed147bd0-9aae-4148-bfea-e70b74f6d097)

  </details>
  
  
  <details>
  <summary> 📁 sliders </summary>
 
 ### JSlider = GUI component that lets user enter a value by using an adjustable sliding knob on a track
 
To change the text of label according to the sliders's value, implements the `ChangeListener` and overrides the method `statechanged(ChangeEvent e)`. <br>
And you should add `.addChangeListener` to item that you want to adjust.
 
 ![image](https://github.com/Ogu1208/Java-Swing/assets/76902448/7db6e32c-9626-44c9-91d7-a8580ee5d932)

  </details>
  
  
  <details>
  <summary> 📁 sliders </summary>
 
 ### JSlider = GUI component that lets user enter a value by using an adjustable sliding knob on a track.
 
To change the text of label according to the sliders's value, implements the `ChangeListener` and overrides the method `statechanged(ChangeEvent e)`. <br>
And you should add `.addChangeListener` to item that you want to adjust.
 
 ![image](https://github.com/Ogu1208/Java-Swing/assets/76902448/7db6e32c-9626-44c9-91d7-a8580ee5d932)

  </details>
  


  <details>
  <summary> 📁 progress bar </summary>
 
 ### progress bar = Visual aid to let the user know that an operation is processing
 
  If you want to simulate the progress bar increasing over time we can use `Thread.sleep` in try-catch.
 
![image](https://github.com/Ogu1208/Java-Swing/assets/76902448/248c791e-a5b8-423f-b40d-07db6f304ebf)

  </details>
