package com.taobao.android.launcher.bootstrap.tao.biz.touch;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.dft;
import tb.yw6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ViewListDelegate extends ArrayList<View> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final dft taskRunner;

    public ViewListDelegate(dft dftVar) {
        this.taskRunner = dftVar;
    }

    public static /* synthetic */ Object ipc$super(ViewListDelegate viewListDelegate, String str, Object... objArr) {
        if (str.hashCode() == 195222152) {
            return new Boolean(super.add((ViewListDelegate) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/bootstrap/tao/biz/touch/ViewListDelegate");
    }

    public boolean add(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df3d232e", new Object[]{this, view})).booleanValue();
        }
        if (!this.taskRunner.a()) {
            yw6.a(view, this.taskRunner);
        }
        return super.add((ViewListDelegate) view);
    }
}
