package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tinct.model.BaseChangeInfo;
import com.taobao.tinct.model.ChangeType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class vks extends BaseChangeInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "bid")
    public String bucketId;

    public vks() {
        this(null, null);
    }

    public static /* synthetic */ Object ipc$super(vks vksVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tinct/model/TSChangeInfo");
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || vks.class != obj.getClass()) {
            return false;
        }
        vks vksVar = (vks) obj;
        if (TextUtils.isEmpty(this.bucketId) || !getTinctTag().equals(vksVar.getTinctTag())) {
            return false;
        }
        return true;
    }

    public String getBucketId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c33edfbe", new Object[]{this});
        }
        return this.bucketId;
    }

    @Override // com.taobao.tinct.model.BaseChangeInfo
    public String getTinctTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f9becd3", new Object[]{this});
        }
        String str = this.bizName;
        String str2 = this.bucketId;
        return "ts|" + str + "|" + str2;
    }

    public vks(String str, String str2) {
        super(ChangeType.TOUCH_STONE);
        this.bucketId = str2;
        this.bizName = str;
    }
}
