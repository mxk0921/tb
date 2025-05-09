package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.monitor.info.node.FileNode;
import com.taobao.media.MediaConstant;
import java.util.Stack;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class tt2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(737149058);
    }

    public static yve a(String str, String str2) {
        int i;
        FileNode fileNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yve) ipChange.ipc$dispatch("9f98a472", new Object[]{str, str2});
        }
        if (str2 == null || "".equals(str2) || MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264.equals(str2)) {
            return null;
        }
        Stack stack = new Stack();
        if (!str2.contains("[")) {
            i = str2.length();
        } else {
            i = str2.indexOf("[");
        }
        FileNode fileNode2 = new FileNode(str, str2.substring(0, i));
        FileNode fileNode3 = fileNode2;
        while (i < str2.length()) {
            char charAt = str2.charAt(i);
            if (charAt != ',') {
                if (charAt == '[') {
                    stack.push(fileNode3);
                } else if (charAt == ']') {
                    stack.pop();
                } else if (charAt != '{') {
                    continue;
                } else {
                    int indexOf = str2.substring(i).indexOf(125) + 1;
                    if (!stack.isEmpty()) {
                        fileNode = (FileNode) stack.peek();
                    } else {
                        fileNode = null;
                    }
                    int i2 = indexOf + i;
                    if (i >= i2) {
                        return null;
                    }
                    FileNode fileNode4 = new FileNode(fileNode, str2.substring(i, i2));
                    if (fileNode != null) {
                        fileNode.addChild(fileNode4);
                    }
                    i = i2;
                    fileNode3 = fileNode4;
                }
            }
            i++;
        }
        return fileNode2;
    }

    public static void b(StringBuilder sb, yve yveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77ba01eb", new Object[]{sb, yveVar});
            return;
        }
        sb.append("[");
        for (yve yveVar2 : yveVar.children()) {
            sb.append(yveVar2.toString());
            if (!yveVar2.children().isEmpty()) {
                b(sb, yveVar2);
            }
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
    }

    public static String c(yve yveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d2fa6e23", new Object[]{yveVar});
        }
        if (yveVar == null) {
            return MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(yveVar.toString());
        if (!yveVar.children().isEmpty()) {
            b(sb, yveVar);
        }
        return sb.toString();
    }
}
