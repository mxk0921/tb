package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.datasource.local.UpdateInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class kkv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f22735a;

    static {
        t2o.a(950009885);
    }

    public void finishUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2f93dc3", new Object[]{this});
        } else {
            this.f22735a = false;
        }
    }

    public boolean isLocalDataValid(UpdateInfo updateInfo) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("121fc49b", new Object[]{this, updateInfo})).booleanValue();
        }
        String config = kjv.sUpdateAdapter.getConfig(gjv.UPDATE_CONFIG_GROUP, gjv.UPDATE_CACHE_HOUR, "3");
        if (TextUtils.isEmpty(config) || !TextUtils.isDigitsOnly(config)) {
            j = 0;
        } else {
            j = Integer.valueOf(config).intValue() * 3600000;
        }
        if (0 != j && updateInfo != null && updateInfo.lastUpdateTime > 0 && nkv.getVersionName().equals(updateInfo.appVersion) && updateInfo.updateList.size() != 0 && System.currentTimeMillis() - updateInfo.lastUpdateTime < j) {
            return true;
        }
        return false;
    }

    public boolean isUpdating() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b68ab1b", new Object[]{this})).booleanValue();
        }
        return this.f22735a;
    }

    public void startUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f8e3ed2", new Object[]{this});
        } else {
            this.f22735a = true;
        }
    }
}
