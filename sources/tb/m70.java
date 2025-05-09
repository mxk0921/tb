package tb;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.safeclean.c;
import com.android.taobao.safeclean.d;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class m70 extends AccsAbstractDataListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, List<pq6>> f23815a = new HashMap();

    static {
        t2o.a(654311426);
        t2o.a(654311441);
    }

    public m70(Application application, boolean z) {
        try {
            d("clean", d.i());
            d(rf2.KEY_ADDITION, c.c());
            if (z) {
                f(application, this);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ Object ipc$super(m70 m70Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/android/taobao/safeclean/AccsSource");
    }

    public void d(String str, pq6 pq6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14bb11b7", new Object[]{this, str, pq6Var});
            return;
        }
        synchronized (this.f23815a) {
            try {
                if (this.f23815a.containsKey(str)) {
                    this.f23815a.get(str).add(pq6Var);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(pq6Var);
                    this.f23815a.put(str, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b678131f", new Object[]{this, str, str2, str3});
            return;
        }
        Iterator it = new ArrayList((Collection) ((HashMap) this.f23815a).get(str)).iterator();
        while (it.hasNext()) {
            ((pq6) it.next()).a("accs", str2, str3);
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694255fc", new Object[]{this, str, str2, str3, bArr, extraInfo});
        } else if (bArr != null) {
            try {
                str4 = new String(bArr, "utf-8");
            } catch (UnsupportedEncodingException unused) {
                str4 = null;
            }
            if (!TextUtils.isEmpty(str4)) {
                Log.e("AccsSource", str4);
                if (str4.contains("additionDataList")) {
                    e(rf2.KEY_ADDITION, "", str4);
                } else {
                    e("clean", "", str4);
                }
            }
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29e89fa", new Object[]{this, str, str2, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4e074", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    public void f(Context context, AccsAbstractDataListener accsAbstractDataListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cad6f3f", new Object[]{this, context, accsAbstractDataListener});
        } else if (!b) {
            b = true;
            GlobalClientInfo.getInstance(context).registerListener("mtl_bypass", accsAbstractDataListener);
        }
    }
}
