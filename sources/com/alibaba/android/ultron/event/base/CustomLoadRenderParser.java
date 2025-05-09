package com.alibaba.android.ultron.event.base;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import tb.o5e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface CustomLoadRenderParser {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum LoadState {
        STATE_LOADING,
        STATE_SUCCESS,
        SATAE_FAILED;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(LoadState loadState, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/base/CustomLoadRenderParser$LoadState");
        }

        public static LoadState valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LoadState) ipChange.ipc$dispatch("5bc32aa", new Object[]{str});
            }
            return (LoadState) Enum.valueOf(LoadState.class, str);
        }
    }

    void a(LoadState loadState, View view, IDMComponent iDMComponent, o5e o5eVar);
}
