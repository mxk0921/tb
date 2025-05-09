package tb;

import android.text.TextUtils;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.desc.MRTCodeDescription;
import com.taobao.mrt.task.desc.MRTResourceDescription;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zph extends vqh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(577765387);
    }

    public zph(MRTResourceDescription mRTResourceDescription) {
        super(mRTResourceDescription);
    }

    public static /* synthetic */ Object ipc$super(zph zphVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mrt/fileoperation/MRTCodeOperation");
    }

    @Override // tb.vqh
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a359826", new Object[]{this, str});
        }
    }

    @Override // tb.vqh
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4232e32", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            MRTResourceDescription mRTResourceDescription = this.f30181a;
            File file = new File(mRTResourceDescription.resourceRootDirectory, mRTResourceDescription.resourceName);
            if (file.exists()) {
                boolean k = mqh.k(file);
                kgh.s(RPCDataItems.SWITCH_TAG_LOG, "deleteRet:" + k);
            }
            mqh.u(new File(str), new File(this.f30181a.resourceRootDirectory));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // tb.vqh
    public boolean c() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39404e61", new Object[]{this})).booleanValue();
        }
        MRTResourceDescription mRTResourceDescription = this.f30181a;
        if (mRTResourceDescription != null && (mRTResourceDescription instanceof MRTCodeDescription)) {
            MRTCodeDescription mRTCodeDescription = (MRTCodeDescription) mRTResourceDescription;
            File file = new File(mRTCodeDescription.resourceRootDirectory, mRTCodeDescription.resourceName);
            if (!file.isDirectory() || !file.exists() || !mqh.a(mRTCodeDescription.mmd5, file.getAbsolutePath())) {
                return false;
            }
            return true;
        }
        return false;
    }
}
