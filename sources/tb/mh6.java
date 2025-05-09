package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.nav.Nav;
import com.taobao.taolive.movehighlight.bundle.timeshift.model.LiveTimemovingModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mh6 extends v10 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLIVE_TIMESHIFT_CUSTOM = -2907519151949712733L;

    static {
        t2o.a(779092630);
    }

    public static /* synthetic */ Object ipc$super(mh6 mh6Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/dx/handler/DXTblive_timeShift_customEventHandler");
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

    @Override // tb.v10
    public void b(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, ux9 ux9Var) {
        Object obj;
        LiveTimemovingModel.TimeMovingHorListButtonStyleVO timeMovingHorListButtonStyleVO;
        LiveTimemovingModel.TimeMovingHorListItemPicVO timeMovingHorListItemPicVO;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c45658f", new Object[]{this, dXEvent, objArr, dXRuntimeContext, ux9Var});
        } else if (dXRuntimeContext != null) {
            try {
                Object obj2 = objArr[0];
                LiveTimemovingModel liveTimemovingModel = (obj2 == null || TextUtils.isEmpty(obj2.toString())) ? null : (LiveTimemovingModel) fkx.f(((JSONObject) objArr[0]).toJSONString(), LiveTimemovingModel.class);
                String str = (String) objArr[1];
                Context h = dXRuntimeContext.h();
                dxa b = dxa.b(ux9Var);
                if ("addToCard".equals(str) && liveTimemovingModel != null) {
                    t90.a(liveTimemovingModel, h, ux9Var);
                } else if ("goToDetail".equals(str) && liveTimemovingModel != null) {
                    t90.f(liveTimemovingModel, h, ux9Var);
                } else if (!"rightInfoAction".equals(str) || liveTimemovingModel == null) {
                    if ("backtoLive".equals(str)) {
                        if (b.k() != null) {
                            b.k().a();
                        }
                    } else if ("normalCardClick".equals(str)) {
                        int intValue = ((Integer) objArr[2]).intValue();
                        if (!(liveTimemovingModel == null || b.l() == null || b.l().c() == null)) {
                            b.l().c().a(liveTimemovingModel, intValue, dXRuntimeContext);
                        }
                    } else if ("goPlaybackButton".equals(str)) {
                        String str2 = (String) objArr[2];
                        if (!TextUtils.isEmpty(str2)) {
                            cxa.d(str2, ux9Var);
                        } else {
                            VideoInfo c0 = up6.c0(ux9Var);
                            if (c0 != null && !TextUtils.isEmpty(c0.liveId)) {
                                cxa.d(c0.liveId, ux9Var);
                            }
                        }
                    } else if ("unsubscribe".equals(str)) {
                        if (b.k() != null) {
                            b.k().c();
                        }
                    } else if ("subscribe".equals(str)) {
                        if (b.k() != null) {
                            b.k().b();
                        }
                    } else if (rg0.JUMP_URL.equals(str)) {
                        if (liveTimemovingModel != null && !zqq.a(liveTimemovingModel.collectUrl)) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("collection_name", liveTimemovingModel.collectName);
                            sbu.f(ux9Var, "timemove_collection_click", hashMap);
                            Nav.from(dXRuntimeContext.h()).toUri(liveTimemovingModel.collectUrl);
                        }
                    } else if ("showGoodsListAction".equals(str)) {
                        if (b.f() != null) {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("glopenfrom", "timemoveclass_simple");
                            b.f().e(ux9Var, hashMap2);
                        }
                    } else if ("subscribeItem".equals(str)) {
                        if (b.l() != null) {
                            b.l().a(liveTimemovingModel, dXRuntimeContext);
                        }
                    } else if ("cliclShowButton".equals(str)) {
                        jxa.a(dXRuntimeContext.h(), ux9Var);
                    } else if ("clickMuteButton".equals(str)) {
                        if (b.l() != null) {
                            b.l().b(false);
                        }
                    } else if ("itemClickToast".equals(str)) {
                        if (!(liveTimemovingModel == null || (timeMovingHorListItemPicVO = liveTimemovingModel.timeMovingHorListItemPicVO) == null || TextUtils.isEmpty(timeMovingHorListItemPicVO.clickToast))) {
                            x0u.a(dXRuntimeContext.h(), liveTimemovingModel.timeMovingHorListItemPicVO.clickToast);
                        }
                    } else if ("buttonClickToast".equals(str) && liveTimemovingModel != null && (timeMovingHorListButtonStyleVO = liveTimemovingModel.timeMovingHorListButtonStyleVO) != null && !TextUtils.isEmpty(timeMovingHorListButtonStyleVO.buttonToast)) {
                        x0u.a(dXRuntimeContext.h(), liveTimemovingModel.timeMovingHorListButtonStyleVO.buttonToast);
                    }
                } else if (b.l() != null) {
                    b.l().g(liveTimemovingModel);
                }
                if (objArr.length > 2 && (obj = objArr[2]) != null && "singBottomActionClick".equals(obj)) {
                    Object obj3 = objArr[0];
                    if (obj3 instanceof JSONObject) {
                        sbu.f(ux9Var, "BottomNavigationBar", iut.a((JSONObject) obj3));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
