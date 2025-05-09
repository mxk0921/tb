package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.TaoBaseService;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class o70 extends AccsAbstractDataListener implements n6e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SERVICE_ID = "mtl";

    /* renamed from: a  reason: collision with root package name */
    public final List<ijv> f25176a = new ArrayList();
    public final bjv b;

    static {
        t2o.a(950009887);
        t2o.a(950009863);
    }

    public o70(bjv bjvVar) {
        this.b = bjvVar;
    }

    public static /* synthetic */ Object ipc$super(o70 o70Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/update/datasource/accs/AccsUpdater");
    }

    @Override // tb.n6e
    public void dispatchUpdate(String str, boolean z, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b6221f5", new Object[]{this, str, new Boolean(z), str2, strArr});
            return;
        }
        Iterator it = new ArrayList(this.f25176a).iterator();
        while (it.hasNext()) {
            ((ijv) it.next()).onUpdate(str, null, z, str2, strArr);
        }
    }

    @Override // tb.n6e
    public String from() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dad658f", new Object[]{this});
        }
        return gjv.ACCS_SOURCE;
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
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

    @Override // tb.n6e
    public void registerDataListener(ijv ijvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6319f22", new Object[]{this, ijvVar});
            return;
        }
        synchronized (this.f25176a) {
            ((ArrayList) this.f25176a).add(ijvVar);
        }
    }

    @Override // tb.n6e
    public void unRegisterDataListener(ijv ijvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39d6321b", new Object[]{this, ijvVar});
            return;
        }
        synchronized (this.f25176a) {
            ((ArrayList) this.f25176a).remove(ijvVar);
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
            new StringBuilder("AccsUpdaterCenter.onData : ").append(str4);
            bjv bjvVar = this.b;
            if (bjvVar != null) {
                bjvVar.commitSuccess("update_center_accs", "accs_message_receiver", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                dispatchUpdate(from(), true, str4, str3);
            }
        }
    }
}
