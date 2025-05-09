package com.taobao.analysis;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.o8c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UemAnalysis {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static o8c sAnalysisDelegate;

    public static void end(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a300860a", new Object[]{str, str2, str3, str4});
            return;
        }
        o8c o8cVar = sAnalysisDelegate;
        if (o8cVar != null) {
            o8cVar.end(str, str2, str3, str4);
        }
    }

    public static void forceCommit(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2f21c1d", new Object[]{str, str2});
            return;
        }
        o8c o8cVar = sAnalysisDelegate;
        if (o8cVar != null) {
            o8cVar.forceCommit(str, str2);
        }
    }

    public static String getFalcoId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d91c337", new Object[0]);
        }
        o8c o8cVar = sAnalysisDelegate;
        if (o8cVar != null) {
            return o8cVar.getFalcoId();
        }
        return "";
    }

    @Deprecated
    public static String getTraceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9afc202f", new Object[0]);
        }
        return getFalcoId();
    }

    public static void registerStages(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccd6d3a", new Object[]{str, list});
            return;
        }
        o8c o8cVar = sAnalysisDelegate;
        if (o8cVar != null) {
            o8cVar.registerStages(str, list);
        }
    }

    public static void setAnalysisDelegate(o8c o8cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f693970", new Object[]{o8cVar});
        } else {
            sAnalysisDelegate = o8cVar;
        }
    }

    public static void start(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6015f711", new Object[]{str, str2, str3, str4});
            return;
        }
        o8c o8cVar = sAnalysisDelegate;
        if (o8cVar != null) {
            o8cVar.start(str, str2, str3, str4);
        }
    }
}
