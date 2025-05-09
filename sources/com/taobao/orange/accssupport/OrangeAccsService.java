package com.taobao.orange.accssupport;

import android.content.Intent;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.orange.ConfigCenter;
import com.taobao.orange.model.NameSpaceDO;
import com.taobao.orange.util.OLog;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import tb.fck;
import tb.ibl;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class OrangeAccsService extends TaoBaseService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Set<NameSpaceDO> f11394a = new HashSet();

    static {
        t2o.a(613417029);
    }

    public static /* synthetic */ Set a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("c8f10726", new Object[0]);
        }
        return f11394a;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e77d7140", new Object[0]);
            return;
        }
        Set<NameSpaceDO> set = f11394a;
        if (!((HashSet) set).isEmpty()) {
            OLog.v("OrangeAccs", "complete", "accs waiting", Integer.valueOf(((HashSet) set).size()));
            Iterator it = ((HashSet) set).iterator();
            while (it.hasNext()) {
                ConfigCenter.getInstance().loadConfigLazy((NameSpaceDO) it.next());
            }
            ((HashSet) f11394a).clear();
            OLog.v("OrangeAccs", "complete end", new Object[0]);
        }
    }

    public static void c(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63a977df", new Object[]{bArr});
        } else {
            fck.c(new a(bArr));
        }
    }

    public static /* synthetic */ Object ipc$super(OrangeAccsService orangeAccsService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/orange/accssupport/OrangeAccsService");
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ byte[] f11395a;

        public a(byte[] bArr) {
            this.f11395a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            byte[] bArr = this.f11395a;
            if (bArr == null || bArr.length <= 0) {
                OLog.e("OrangeAccs", "handleUpdate data is empty", new Object[0]);
                return;
            }
            NameSpaceDO nameSpaceDO = (NameSpaceDO) JSON.parseObject(new String(bArr), NameSpaceDO.class);
            if (nameSpaceDO == null) {
                OLog.e("OrangeAccs", "handleUpdate fail as namespace null", new Object[0]);
                return;
            }
            if (OLog.isPrintLog(1)) {
                OLog.d("OrangeAccs", "handleUpdate", "namespace", ibl.e(nameSpaceDO));
            }
            if (ConfigCenter.getInstance().mIsOrangeInit.get()) {
                ConfigCenter.getInstance().loadConfigLazy(nameSpaceDO);
            } else {
                OLog.w("OrangeAccs", "handleUpdate fail as not init completed", new Object[0]);
                OrangeAccsService.a().add(nameSpaceDO);
            }
            if (com.taobao.orange.a.g != null) {
                Intent intent = new Intent("com.taobao.orange.monitor.DATA");
                intent.setPackage(com.taobao.orange.a.g.getPackageName());
                intent.putExtra("changeType", "grey");
                intent.putExtra("namespace", nameSpaceDO.name);
                intent.putExtra("version", nameSpaceDO.version);
                com.taobao.orange.a.g.sendBroadcast(intent);
                OLog.e("OrangeAccs", "sendBroadcast", "namespace", nameSpaceDO.name, "version", nameSpaceDO.version);
            }
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694255fc", new Object[]{this, str, str2, str3, bArr, extraInfo});
        } else if ("orange".equals(str)) {
            OLog.i("OrangeAccs", "onData", "dataId", str3, "userId", str2);
            c(bArr);
        }
    }
}
