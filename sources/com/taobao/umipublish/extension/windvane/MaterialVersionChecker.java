package com.taobao.umipublish.extension.windvane;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.framework.container.loading.a;
import com.taobao.taobao.R;
import com.taobao.taopai.material.bean.MaterialDetail;
import com.taobao.taopai2.material.business.materialdetail.MaterialDetailBean;
import com.taobao.taopai2.material.business.specified.MaterialSpecifiedRule;
import com.taobao.taopai2.material.business.specified.SpecifiedFilterResultBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.e9g;
import tb.eag;
import tb.ebg;
import tb.fkg;
import tb.irc;
import tb.k7i;
import tb.krq;
import tb.odg;
import tb.qrf;
import tb.t2o;
import tb.ypc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MaterialVersionChecker implements IMaterialVersionChecker {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEFAULT_ERROR = "500";
    private static final String TAG = "VersionCheckUtil";
    private final a sLoadingConfig = new a.b().k(0.5f).l(Localization.q(R.string.gg_pub_please_wait)).i(false).h();
    private final int INVALID_MATERIAL_ID = -1;
    private String mBizLine = "guangguang";
    private String mBizScene = "guangguang";
    private ypc.a EMPTY_RUNNABLE = new ypc.a(this) { // from class: com.taobao.umipublish.extension.windvane.MaterialVersionChecker.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.ypc.a
        public void a(MaterialDetail materialDetail, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("62ff7e2c", new Object[]{this, materialDetail, str, str2});
            }
        }

        @Override // tb.ypc.a
        public void b(MaterialDetail materialDetail) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b8060a9d", new Object[]{this, materialDetail});
            }
        }
    };

    static {
        t2o.a(944767074);
        t2o.a(944767071);
    }

    public static /* synthetic */ boolean access$000(MaterialVersionChecker materialVersionChecker, SpecifiedFilterResultBean specifiedFilterResultBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4cd979", new Object[]{materialVersionChecker, specifiedFilterResultBean})).booleanValue();
        }
        return materialVersionChecker.isEmptyResponse(specifiedFilterResultBean);
    }

    public static /* synthetic */ String access$100(MaterialVersionChecker materialVersionChecker, SpecifiedFilterResultBean specifiedFilterResultBean, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fab4402", new Object[]{materialVersionChecker, specifiedFilterResultBean, str});
        }
        return materialVersionChecker.getErrorCode(specifiedFilterResultBean, str);
    }

    public static /* synthetic */ void access$200(MaterialVersionChecker materialVersionChecker, Activity activity, String str, String str2, ypc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b74b1c3", new Object[]{materialVersionChecker, activity, str, str2, aVar});
        } else {
            materialVersionChecker.toastAndCallbackError(activity, str, str2, aVar);
        }
    }

    private String getErrorCode(SpecifiedFilterResultBean specifiedFilterResultBean, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("708274aa", new Object[]{this, specifiedFilterResultBean, str});
        }
        Map<String, MaterialSpecifiedRule> map = specifiedFilterResultBean.mRuleMap;
        if (map == null || map.get(str) == null) {
            return "500";
        }
        return String.valueOf(specifiedFilterResultBean.mRuleMap.get(str).mRuleCode);
    }

    private boolean isEmptyResponse(SpecifiedFilterResultBean specifiedFilterResultBean) {
        List<MaterialDetailBean> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5340d75", new Object[]{this, specifiedFilterResultBean})).booleanValue();
        }
        if (specifiedFilterResultBean == null || (list = specifiedFilterResultBean.mMaterialList) == null || list.isEmpty() || specifiedFilterResultBean.mMaterialList.get(0) == null) {
            return true;
        }
        return false;
    }

    private ypc.a notNullRunnable(ypc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ypc.a) ipChange.ipc$dispatch("f19bcbd8", new Object[]{this, aVar});
        }
        if (aVar == null) {
            return this.EMPTY_RUNNABLE;
        }
        return aVar;
    }

    private void toastAndCallbackError(Activity activity, String str, String str2, ypc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7728ff50", new Object[]{this, activity, str, str2, aVar});
            return;
        }
        String x = eag.x(str, str2);
        ebg.h(activity, x);
        aVar.a(null, str, x);
    }

    @Override // tb.ypc
    public void check(Context context, int i, ypc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7603907a", new Object[]{this, context, new Integer(i), aVar});
        }
    }

    @Override // tb.ypc
    public void check(Context context, int i, JSONObject jSONObject, ypc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bf69196", new Object[]{this, context, new Integer(i), jSONObject, aVar});
        } else if ((context instanceof FragmentActivity) && i == 0) {
            checkFunTemplateVersion((FragmentActivity) context, jSONObject, notNullRunnable(aVar));
        }
    }

    private void checkFunTemplateVersion(FragmentActivity fragmentActivity, JSONObject jSONObject, ypc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("850bc5e9", new Object[]{this, fragmentActivity, jSONObject, aVar});
            return;
        }
        int h = qrf.h(jSONObject, "fun_id", -1);
        if (h == -1) {
            odg.d(TAG, "there is no default material. then valid!");
            aVar.b(null);
            return;
        }
        check(fragmentActivity, String.valueOf(h), fkg.LE_VERSION, Localization.q(R.string.gg_pub_prop), aVar);
    }

    public void check(final FragmentActivity fragmentActivity, final String str, int i, final String str2, final ypc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab0d3ebb", new Object[]{this, fragmentActivity, str, new Integer(i), str2, aVar});
        } else if (aVar != null) {
            e9g.i(fragmentActivity, this.sLoadingConfig);
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(krq.k(str, -1L)));
            new k7i(fragmentActivity, this.mBizLine, this.mBizScene).q0(this.mBizLine, this.mBizScene, i, arrayList, new irc() { // from class: com.taobao.umipublish.extension.windvane.MaterialVersionChecker.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.irc
                public void f(SpecifiedFilterResultBean specifiedFilterResultBean) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f000f6f1", new Object[]{this, specifiedFilterResultBean});
                        return;
                    }
                    e9g.c(fragmentActivity);
                    if (MaterialVersionChecker.access$000(MaterialVersionChecker.this, specifiedFilterResultBean)) {
                        MaterialVersionChecker materialVersionChecker = MaterialVersionChecker.this;
                        MaterialVersionChecker.access$200(materialVersionChecker, fragmentActivity, MaterialVersionChecker.access$100(materialVersionChecker, specifiedFilterResultBean, str), str2, aVar);
                        return;
                    }
                    MaterialDetail materialDetail = new MaterialDetail();
                    materialDetail.copyFrom(specifiedFilterResultBean.mMaterialList.get(0));
                    aVar.b(materialDetail);
                }

                @Override // tb.pjd
                public void onFail(String str3, String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f2f5f2b8", new Object[]{this, str3, str4});
                        return;
                    }
                    e9g.c(fragmentActivity);
                    MaterialVersionChecker.access$200(MaterialVersionChecker.this, fragmentActivity, "500", str2, aVar);
                }
            });
        }
    }
}
