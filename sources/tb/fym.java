package tb;

import android.text.TextUtils;
import com.alibaba.android.umbrella.performance.ProcessEntity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fym {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INIT_SIZE = 5;
    public static fym b;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, ProcessEntity> f19632a;

    public fym(int i) {
        this.f19632a = new HashMap<>(i);
    }

    public static fym b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fym) ipChange.ipc$dispatch("afa6443b", new Object[0]);
        }
        if (b == null) {
            b = new fym(5);
        }
        return b;
    }

    public void a(ProcessEntity processEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f1e7ce", new Object[]{this, processEntity});
        } else if (processEntity != null && !TextUtils.isEmpty(processEntity.bizName)) {
            if (this.f19632a.containsKey(processEntity.bizName)) {
                this.f19632a.remove(processEntity);
            }
            this.f19632a.put(processEntity.bizName, processEntity);
        }
    }

    public ProcessEntity c(String str) {
        HashMap<String, ProcessEntity> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProcessEntity) ipChange.ipc$dispatch("a3a0ef0f", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || (hashMap = this.f19632a) == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f19632a.get(str);
    }

    public Map<String, ProcessEntity> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("83ace81f", new Object[]{this});
        }
        return this.f19632a;
    }

    public boolean e(String str) {
        HashMap<String, ProcessEntity> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28b4733e", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (hashMap = this.f19632a) == null || !hashMap.containsKey(str)) {
            return false;
        }
        return true;
    }

    public void f(ProcessEntity processEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2a83931", new Object[]{this, processEntity});
        } else if (processEntity != null && !TextUtils.isEmpty(processEntity.bizName) && this.f19632a.containsKey(processEntity.bizName)) {
            this.f19632a.remove(processEntity.bizName);
        }
    }
}
