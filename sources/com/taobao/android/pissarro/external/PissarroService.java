package com.taobao.android.pissarro.external;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.rod;
import tb.t2o;
import tb.tv2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class PissarroService implements rod {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private rod mService;

    static {
        t2o.a(623902774);
        t2o.a(623902771);
    }

    public PissarroService(Context context) {
        this.mService = new ServiceImpl(context);
    }

    @Override // tb.rod
    public void editPicture(Config config, String str, tv2 tv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60de3f6e", new Object[]{this, config, str, tv2Var});
        } else {
            this.mService.editPicture(config, str, tv2Var);
        }
    }

    @Override // tb.rod
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else {
            this.mService.onCreate();
        }
    }

    @Override // tb.rod
    public void onDestory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbef83c", new Object[]{this});
        } else {
            this.mService.onDestory();
        }
    }

    @Override // tb.rod
    public void openAlbum(Config config, tv2 tv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("811a35e9", new Object[]{this, config, tv2Var});
        } else {
            this.mService.openAlbum(config, tv2Var);
        }
    }

    @Override // tb.rod
    public void openCamera(Config config, tv2 tv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a1fedb3", new Object[]{this, config, tv2Var});
        } else {
            this.mService.openCamera(config, tv2Var);
        }
    }

    @Override // tb.rod
    public void openCameraOrAlbum(Config config, tv2 tv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deac88e1", new Object[]{this, config, tv2Var});
        } else {
            this.mService.openCameraOrAlbum(config, tv2Var);
        }
    }
}
