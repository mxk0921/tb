package tb;

import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class tpx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final upx b;
    public int c;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<String> f28876a = new ArrayList<>();
    public long d = 0;

    static {
        t2o.a(245366987);
    }

    public tpx() {
        this.b = null;
        this.b = (upx) BioServiceManager.getCurrentInstance().getBioService(upx.class);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecfa2422", new Object[]{this, str});
            return;
        }
        upx upxVar = this.b;
        if (upxVar != null) {
            upxVar.write(str);
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf8a5791", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put(upx.PAGE_NUMBER, Integer.toString(this.c));
        hashMap.put("reason", str);
        upx upxVar = this.b;
        if (upxVar != null) {
            upxVar.write(upx.ALERT_APPEAR, hashMap);
        }
    }

    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d90f9d9d", new Object[]{this, str, str2});
            return;
        }
        HashMap hashMap = new HashMap(3);
        hashMap.put(upx.PAGE_NUMBER, Integer.toString(this.c));
        hashMap.put(upx.PAGE_CONTENT, str);
        hashMap.put(upx.CLICK_ALERT, str2);
        upx upxVar = this.b;
        if (upxVar != null) {
            upxVar.write(upx.ALERT_CHOOSE, hashMap);
        }
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eb71dcd", new Object[]{this, new Integer(i)});
            return;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(upx.AUTH_CHECK_RESULT, Integer.toString(i));
        upx upxVar = this.b;
        if (upxVar != null) {
            upxVar.write(upx.AUTH_CHECK, hashMap);
        }
        if (i == 0) {
            c(upx.CAMERA_ERROR);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdfc9bb2", new Object[]{this});
            return;
        }
        ArrayList<String> arrayList = this.f28876a;
        if (arrayList != null && arrayList.size() > 0) {
            BioLog.i("ZdocRecord", "recordBasicCheck");
            HashMap hashMap = new HashMap(2);
            hashMap.put(upx.PAGE_NUMBER, Integer.toString(this.c));
            hashMap.put(upx.PAGE_CONTENT, Arrays.toString(this.f28876a.toArray()));
            upx upxVar = this.b;
            if (upxVar != null) {
                upxVar.write(upx.BASIC_CHECK, hashMap);
            }
            this.f28876a.clear();
        }
    }

    public void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17c5a6e4", new Object[]{this, str, str2});
            return;
        }
        HashMap hashMap = new HashMap(3);
        hashMap.put(upx.PAGE_NUMBER, Integer.toString(this.c));
        hashMap.put(upx.ON_PAGE, str);
        hashMap.put(upx.CLICK_ITEM, str2);
        upx upxVar = this.b;
        if (upxVar != null) {
            upxVar.write(upx.CLICK_BUTTON, hashMap);
        }
    }

    public void h(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81efc992", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.b != null) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("width", String.valueOf(i));
            hashMap.put("height", String.valueOf(i2));
            this.b.write(upx.FRAME_SIZE_WH, hashMap);
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dec86ad", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(upx.PAGE_NUMBER, Integer.toString(this.c));
        upx upxVar = this.b;
        if (upxVar != null) {
            upxVar.write(upx.OVER_THRESHOLD, hashMap);
        }
    }

    public void j(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94115ed3", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(upx.PAGE_NUMBER, Integer.toString(this.c));
        hashMap.put(upx.UPLOAD_RESULT, Integer.toString(i));
        hashMap.put(upx.VALIDATION_RESULT, Integer.toString(i2));
        hashMap.put(upx.SERVER_RESULT, Integer.toString(i3));
        hashMap.put(upx.UPLOAD_TIME, String.valueOf(System.currentTimeMillis() - this.d));
        upx upxVar = this.b;
        if (upxVar != null) {
            upxVar.write(upx.UPLOAD_END, hashMap);
        }
    }

    public void k(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf59374d", new Object[]{this, new Long(j)});
            return;
        }
        this.d = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put(upx.PAGE_NUMBER, Integer.toString(this.c));
        hashMap.put("payload", String.valueOf(((float) j) / 1024.0f));
        upx upxVar = this.b;
        if (upxVar != null) {
            upxVar.write("uploadStart", hashMap);
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ea132f", new Object[]{this});
            return;
        }
        upx upxVar = this.b;
        if (upxVar != null) {
            upxVar.retry();
        }
    }

    public void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac07639b", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }
}
