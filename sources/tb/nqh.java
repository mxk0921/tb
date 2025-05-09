package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.desc.MRTFilesDescription;
import com.taobao.mrt.task.desc.MRTResourceDescription;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nqh extends vqh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(577765388);
    }

    public nqh(MRTResourceDescription mRTResourceDescription) {
        super(mRTResourceDescription);
    }

    public static /* synthetic */ Object ipc$super(nqh nqhVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mrt/fileoperation/MRTFilesOperation");
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
        MRTResourceDescription mRTResourceDescription = this.f30181a;
        File file = new File(mRTResourceDescription.resourceRootDirectory, mRTResourceDescription.resourceName);
        if (file.exists()) {
            mqh.k(file);
        }
        return mqh.u(new File(str), file);
    }

    @Override // tb.vqh
    public boolean c() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39404e61", new Object[]{this})).booleanValue();
        }
        MRTResourceDescription mRTResourceDescription = this.f30181a;
        if (mRTResourceDescription == null || !(mRTResourceDescription instanceof MRTFilesDescription)) {
            return false;
        }
        MRTFilesDescription mRTFilesDescription = (MRTFilesDescription) mRTResourceDescription;
        File file = new File(this.f30181a.resourceRootDirectory + "/" + this.f30181a.resourceName);
        if (!file.isDirectory() || !file.exists()) {
            return false;
        }
        int size = mRTFilesDescription.files.size();
        int i = 0;
        for (String str : mRTFilesDescription.files.keySet()) {
            if (!mqh.b(mRTFilesDescription.files.get(str), new File(file, str))) {
                break;
            }
            i++;
        }
        if (i == size) {
            return true;
        }
        return false;
    }

    public String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a856303", new Object[]{this, str});
        }
        MRTResourceDescription mRTResourceDescription = this.f30181a;
        if (mRTResourceDescription != null && (mRTResourceDescription instanceof MRTFilesDescription)) {
            String str2 = this.f30181a.resourceRootDirectory + "/" + this.f30181a.resourceName + "/" + str;
            if (new File(str2).exists()) {
                return str2;
            }
        }
        return null;
    }
}
