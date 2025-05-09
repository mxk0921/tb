package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.detail.rate.vivid.presenter.PreRequestPresenter;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class lh6 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLIVE_ROOM_SET_FAVORITE = -5524427611287014876L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements sqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXRuntimeContext f23336a;

        public a(lh6 lh6Var, DXRuntimeContext dXRuntimeContext) {
            this.f23336a = dXRuntimeContext;
        }

        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
            } else if (!TextUtils.equals(str, PreRequestPresenter.SOURCE_RATE_HISTORY)) {
                kiv.c(this.f23336a.h(), str2);
            }
        }

        public void b(i39 i39Var) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72df1e57", new Object[]{this, i39Var});
                return;
            }
            kiv.c(this.f23336a.h(), this.f23336a.h().getString(R.string.taolive_user_favorite_success));
            if (giv.d() == null || giv.d().c() == null) {
                str = null;
            } else {
                str = giv.d().c().C();
            }
            sjr.g().c(uyg.EVENT_CLOSE_FAVORITE_GUIDE_DIALOG, null, str);
        }
    }

    static {
        t2o.a(806355713);
    }

    public static /* synthetic */ Object ipc$super(lh6 lh6Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/dx/event/DXTblive_room_set_favoriteEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr != null && objArr.length > 0 && (videoInfo = (VideoInfo) fkx.f(((JSONObject) objArr[0]).toJSONString(), VideoInfo.class)) != null && videoInfo.broadCaster != null) {
            c39 c39Var = new c39();
            c39Var.f16815a = videoInfo.broadCaster.accountId;
            v2s.o().j().b(c39Var, new a(this, dXRuntimeContext));
            giv.f().d("LayerThickness_Favor", new String[0]);
        }
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }
}
