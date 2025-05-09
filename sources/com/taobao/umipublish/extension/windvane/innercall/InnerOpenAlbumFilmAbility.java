package com.taobao.umipublish.extension.windvane.innercall;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.vivid.presenter.PreRequestPresenter;
import com.taobao.umipublish.extension.windvane.IAlbumFilmBridge;
import tb.dov;
import tb.kdp;
import tb.nsw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class InnerOpenAlbumFilmAbility extends InnerCallBaseAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(944767214);
    }

    public static /* synthetic */ void access$000(InnerOpenAlbumFilmAbility innerOpenAlbumFilmAbility, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbc4a9b5", new Object[]{innerOpenAlbumFilmAbility, str, str2});
        } else {
            innerOpenAlbumFilmAbility.errorCallback(str, str2);
        }
    }

    public static /* synthetic */ Object ipc$super(InnerOpenAlbumFilmAbility innerOpenAlbumFilmAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/innercall/InnerOpenAlbumFilmAbility");
    }

    @Override // com.taobao.umipublish.extension.windvane.innercall.InnerCallBaseAbility
    public void onExecute(JSONObject jSONObject, dov.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1150513", new Object[]{this, jSONObject, aVar});
            return;
        }
        updateUrlPrams(jSONObject);
        ((IAlbumFilmBridge) kdp.a(IAlbumFilmBridge.class, new Object[0])).openInner(this.mContext, new WVCallBackContext(null) { // from class: com.taobao.umipublish.extension.windvane.innercall.InnerOpenAlbumFilmAbility.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                if (str.hashCode() == 1449175677) {
                    super.error((nsw) objArr[0]);
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/innercall/InnerOpenAlbumFilmAbility$1");
            }

            @Override // android.taobao.windvane.jsbridge.WVCallBackContext
            public void error(nsw nswVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5660aa7d", new Object[]{this, nswVar});
                    return;
                }
                super.error(nswVar);
                InnerOpenAlbumFilmAbility.this.revertUrlParams();
                InnerOpenAlbumFilmAbility.access$000(InnerOpenAlbumFilmAbility.this, PreRequestPresenter.SOURCE_RATE_HISTORY, "USER_CANCELED");
            }
        });
    }
}
