package com.alibaba.security.wukong.model.meta;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AlgoResult extends BaseData {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String code;
    public boolean inferDirect = true;
    public boolean triggerHeart = true;
    public Object value;

    public AlgoResult(String str, Object obj) {
        super(System.currentTimeMillis());
        this.code = str;
        this.value = obj;
    }

    public static /* synthetic */ Object ipc$super(AlgoResult algoResult, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/wukong/model/meta/AlgoResult");
    }

    public String getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa4e0476", new Object[]{this});
        }
        return this.code;
    }

    @Override // com.alibaba.security.wukong.model.meta.Data
    public Map<String, Object> getRawMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("49177706", new Object[]{this});
        }
        return null;
    }

    public Object getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6045ccb0", new Object[]{this});
        }
        return this.value;
    }

    public boolean isInferDirect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa49f858", new Object[]{this})).booleanValue();
        }
        return this.inferDirect;
    }

    public boolean isTriggerHeart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1215843", new Object[]{this})).booleanValue();
        }
        return this.triggerHeart;
    }

    @Override // com.alibaba.security.wukong.model.meta.Data
    public int length() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("451fdc60", new Object[]{this})).intValue();
        }
        return 1;
    }

    public void setCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3f1cac0", new Object[]{this, str});
        } else {
            this.code = str;
        }
    }

    public void setInferDirect(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0e20438", new Object[]{this, new Boolean(z)});
        } else {
            this.inferDirect = z;
        }
    }

    public void setTriggerHeart(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ea60a3d", new Object[]{this, new Boolean(z)});
        } else {
            this.triggerHeart = z;
        }
    }

    public void setValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae52f80", new Object[]{this, str});
        } else {
            this.value = str;
        }
    }

    @Override // com.alibaba.security.wukong.model.meta.Data
    public String type() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("426047ff", new Object[]{this});
        }
        return "algoResult";
    }
}
