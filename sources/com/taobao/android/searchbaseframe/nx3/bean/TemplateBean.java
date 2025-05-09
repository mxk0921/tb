package com.taobao.android.searchbaseframe.nx3.bean;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.bpl;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TemplateBean implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EAGLE_SUFFIX = "-bin";
    public boolean binary;
    public boolean cellBinary;
    public String dItemType;
    public boolean forceDownload;
    public String isGray;
    public int listHeight;
    public String md5;
    public int midHeight;
    public int required;
    public int[] supportedStyle;
    public String templateName;
    public String url;
    public String version;

    static {
        t2o.a(993001913);
    }

    public static bpl<String, String> getTemplateNameAndVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bpl) ipChange.ipc$dispatch("92a362ff", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        if (isBinaryFile(str)) {
            str = str.substring(0, str.length() - 4);
        }
        int lastIndexOf = str.lastIndexOf(45);
        if (lastIndexOf < 0) {
            return null;
        }
        return bpl.a(str.substring(0, lastIndexOf), str.substring(lastIndexOf + 1));
    }

    public static boolean isBinaryFile(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b60a4d3c", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        return str.endsWith(EAGLE_SUFFIX);
    }

    public String getFileName() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("787e7f7c", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.templateName);
        sb.append("-");
        sb.append(this.version);
        if (this.binary) {
            str = EAGLE_SUFFIX;
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    public String toPrintString() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a5db8b36", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getFileName() + "\n    " + this.url + "\n    " + this.md5);
        if (TextUtils.isEmpty(this.dItemType)) {
            str = "";
        } else {
            str = "    dItemType: " + this.dItemType;
        }
        sb.append(str);
        return sb.toString();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TemplateBean{templateName='" + this.templateName + "', url='" + this.url + "', version='" + this.version + "', md5='" + this.md5 + "', dItemType='" + this.dItemType + "', listHeight=" + this.listHeight + ", midHeight=" + this.midHeight + '}';
    }
}
