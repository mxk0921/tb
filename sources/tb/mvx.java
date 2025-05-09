package tb;

import com.alipay.security.mobile.module.http.v2.IUploadV2;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class mvx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final File f24341a;
    public final IUploadV2 b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                mvx.this.b();
            } catch (Exception e) {
                nvx.c(e);
            }
        }
    }

    public mvx(String str, IUploadV2 iUploadV2) {
        this.f24341a = null;
        this.b = null;
        this.f24341a = new File(str);
        this.b = iUploadV2;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "id");
            jSONObject.put("error", str);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public final synchronized void b() {
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            File file = this.f24341a;
            if (file != null) {
                if (file.exists() && this.f24341a.isDirectory() && this.f24341a.list().length != 0) {
                    ArrayList arrayList = new ArrayList();
                    for (String str : this.f24341a.list()) {
                        arrayList.add(str);
                    }
                    Collections.sort(arrayList);
                    String str2 = (String) arrayList.get(arrayList.size() - 1);
                    int size = arrayList.size();
                    if (str2.equals(new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime()) + ".log")) {
                        if (arrayList.size() >= 2) {
                            str2 = (String) arrayList.get(arrayList.size() - 2);
                            size--;
                        } else {
                            return;
                        }
                    }
                    if (!this.b.logCollect(a(wux.a(this.f24341a.getAbsolutePath(), str2)))) {
                        size--;
                    }
                    for (int i = 0; i < size; i++) {
                        new File(this.f24341a, (String) arrayList.get(i)).delete();
                    }
                }
            }
        }
    }
}
