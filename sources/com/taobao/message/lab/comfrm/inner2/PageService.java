package com.taobao.message.lab.comfrm.inner2;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PageService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Activity mActivity;

    static {
        t2o.a(537919632);
    }

    public PageService(Activity activity) {
        this.mActivity = activity;
    }

    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
        } else {
            this.mActivity.finish();
        }
    }

    public Activity getActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return this.mActivity;
    }

    public Nav nav() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("f3d660b7", new Object[]{this});
        }
        return Nav.from(this.mActivity);
    }
}
