package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class orw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String v = "0";
    public b stat = new b();
    public boolean isErrorBlacklist = true;
    public List<a> errorRule = new ArrayList();
    public double perfCheckSampleRate = vu3.b.GEO_NOT_SUPPORT;
    public String perfCheckURL = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a {
        public String url = "";
        public Pattern urlPattern = null;
        public String msg = "";
        public Pattern msgPattern = null;
        public String code = "";

        static {
            t2o.a(989856333);
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class b {
        public int resSample;
        public long onLoad = 0;
        public long onDomLoad = 0;
        public long resTime = 0;
        public boolean netstat = false;

        static {
            t2o.a(989856334);
        }

        public b() {
        }
    }

    static {
        t2o.a(989856332);
    }

    public a newErrorRuleInstance(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("e5688bab", new Object[]{this, str, str2, str3});
        }
        a aVar = new a();
        aVar.url = str;
        aVar.msg = str2;
        aVar.code = str3;
        return aVar;
    }
}
