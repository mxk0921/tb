package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vqa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f30178a;
    public String b;
    public final StringBuffer c = new StringBuffer();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                uqa.b(vqa.b(vqa.this), vqa.c(vqa.this), vqa.d(vqa.this).toString());
            }
        }
    }

    static {
        t2o.a(729809110);
    }

    public static /* synthetic */ String b(vqa vqaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e1491e8", new Object[]{vqaVar});
        }
        return vqaVar.f30178a;
    }

    public static /* synthetic */ String c(vqa vqaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7bd409e9", new Object[]{vqaVar});
        }
        return vqaVar.b;
    }

    public static /* synthetic */ StringBuffer d(vqa vqaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringBuffer) ipChange.ipc$dispatch("ad60ce4a", new Object[]{vqaVar});
        }
        return vqaVar.c;
    }

    public static vqa k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vqa) ipChange.ipc$dispatch("5af8b6c2", new Object[0]);
        }
        return new vqa();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
            return;
        }
        Boolean bool = (Boolean) mza.d().c("homeNetLowOptimization", Boolean.class);
        if (bool == null || !bool.booleanValue()) {
            uqa.b(this.f30178a, this.b, this.c.toString());
        } else {
            m5a.a().k(new a());
        }
    }

    public vqa e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vqa) ipChange.ipc$dispatch("1204947f", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            StringBuffer stringBuffer = this.c;
            stringBuffer.append(str);
            stringBuffer.append(" ");
        }
        return this;
    }

    public vqa f(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vqa) ipChange.ipc$dispatch("89690402", new Object[]{this, str, new Integer(i)});
        }
        StringBuffer stringBuffer = this.c;
        stringBuffer.append(str);
        stringBuffer.append(":");
        stringBuffer.append(i);
        stringBuffer.append(".");
        return this;
    }

    public vqa g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vqa) ipChange.ipc$dispatch("31e99c49", new Object[]{this, str, str2});
        }
        StringBuffer stringBuffer = this.c;
        stringBuffer.append(str);
        stringBuffer.append(":");
        stringBuffer.append(str2);
        stringBuffer.append(";");
        return this;
    }

    public vqa h(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vqa) ipChange.ipc$dispatch("c2c15ed3", new Object[]{this, str, new Boolean(z)});
        }
        StringBuffer stringBuffer = this.c;
        stringBuffer.append(str);
        stringBuffer.append(":");
        stringBuffer.append(z);
        stringBuffer.append(".");
        return this;
    }

    public vqa i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vqa) ipChange.ipc$dispatch("57aa36fb", new Object[]{this, str});
        }
        this.f30178a = str;
        return this;
    }

    public vqa j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vqa) ipChange.ipc$dispatch("b92d45ed", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }
}
