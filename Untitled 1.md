


$$
T=M*P=\left[ \begin{matrix}
   2 & -2 & 1 & 1\\
   -3 & 3 & -2 & -1\\
   0 & 0 & 1 & 0\\
   1 & 0 & 0 & 0
  \end{matrix} \right]*
  \left[ \begin{matrix}
   P(0)\\
   P(1)\\
   P'(0)\\
   P'(1)
  \end{matrix} \right]
$$



$$
T=M*P=\left[ \begin{matrix}
   2 & -2 & 1 & 1\\
   -3 & 3 & -2 & -1\\
   0 & 0 & 1 & 0\\
   1 & 0 & 0 & 0
  \end{matrix} \right]*
  \left[ \begin{matrix}
   P(0)\\
   P(1)\\
   P'(0)\\
   P'(1)
  \end{matrix} \right]
$$



$$
P=T*M*P0=
\left[ \begin{matrix}t^2& t &1
\end{matrix} \right]
*
\left[ \begin{matrix}
   1 & -2 & 1 \\
   -2 & 2 & 0 \\
   1 & 0 & 0 
  \end{matrix} \right]*
  \left[ \begin{matrix}
   P(0)\\
   P(1)\\
  \end{matrix} \right]
$$




```
function bezier(vertices)
Dim=size(vertices,1); %二维或三维空间
NumPoint=size(vertices,2)-1; %点的个数
t=0:0.001:1;
x=[];y=[];z=[];
if Dim==2
    x=(1-t).^(NumPoint)*vertices(1,1)
    y=(1-t).^(NumPoint)*vertices(2,1)
    for j=1:NumPoint
    w=factorical(NumPoint)/(fractorial(j)*factorial(NumPoint-j))*(1-t).^(NumPoint-j).*t.^j
    x=x+w*vertices(1,j+1);
    y=y+w*vertices(2,j+1)
    end

    plot(vertices(1,:),vertices(2,:),'b');
    hold on;grid on;
    axis tight;
    xlabel('X')
    ylabel('Y')
    plot(x,y,'r')
end 

if Dim==3
    x=(1-t).^NumPoint*vertices(1,1)
    y=(1-t).^NumPoint*vertices(2,1)
    z=(1-t).^NumPoint*vertices(3,1)
    
    for j=1:NumPoint
        w=factorical(NumPoint)/(fractorial(j)*factorial(NumPoint-j))*(1-t).^(NumPoint-j).*t.^j
        x=x+w*vertices(1,j+1);
        y=y+w*vertices(2,j+1)
        z=z+w*vertices(3,j+1)
        end

    plot3(vertices(1,:),vertices(2,:),vertices(3,:),'b');
    hold on;grid on;
    axis tight;
    xlabel('X')
    ylabel('Y')
    zlabel('Z')
    plot3(x,y,z,'r')
    view(3)
end 
end

```

