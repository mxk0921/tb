package com.taobao.themis.kernel.entity;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.resource.api.models.AppInfoScene;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import tb.a07;
import tb.ckf;
import tb.g9s;
import tb.gbs;
import tb.ges;
import tb.ies;
import tb.njg;
import tb.qxq;
import tb.t2o;
import tb.t8s;
import tb.tsq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class InstanceStartParams implements Parcelable {
    private static final String APP_ID = "_ariver_appid";
    private static final String CONTAINER_TYPE = "_container_type";
    public static final a CREATOR = new a(null);
    private static final String DEBUG_FLAG = "nbsource";
    private static final String KEY_FRAME_TYPE = "_frame_type";
    public static final String KEY_IS_FRAGMENT_CONTAINER = "isFragmentContainer";
    private static final String KEY_OPEN_MODEL = "openModel";
    private static final String KEY_ORI_URL = "ori_url";
    public static final String KEY_PAGE_BG_COLOR = "tms_page_bgcolor";
    private static final String NBSN = "nbsn";
    private static final String NBSV = "nbsv";
    private static final String PAGE = "page";
    private JSONObject extraData;
    private Bundle mQuery;
    private final njg mUniAppBaseInfo$delegate;
    private String mUrl;
    private Bundle urlParams;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements Parcelable.Creator<InstanceStartParams> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909531);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        /* renamed from: a */
        public InstanceStartParams createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InstanceStartParams) ipChange.ipc$dispatch("8c9553a5", new Object[]{this, parcel});
            }
            ckf.g(parcel, "parcel");
            return new InstanceStartParams(parcel);
        }

        /* renamed from: b */
        public InstanceStartParams[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InstanceStartParams[]) ipChange.ipc$dispatch("cc03e85c", new Object[]{this, new Integer(i)});
            }
            return new InstanceStartParams[i];
        }

        public a() {
        }
    }

    static {
        t2o.a(839909530);
    }

    private InstanceStartParams() {
        this.mUniAppBaseInfo$delegate = kotlin.a.b(new InstanceStartParams$mUniAppBaseInfo$2(this));
        this.extraData = new JSONObject();
    }

    private final String configOpenMode(Uri uri) {
        if (t8s.e(uri)) {
            return "afc_open_link";
        }
        return "normal_link";
    }

    private final ges.a getMUniAppBaseInfo() {
        return (ges.a) this.mUniAppBaseInfo$delegate.getValue();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getAppFrameType() {
        Bundle bundle = this.urlParams;
        if (bundle != null) {
            String b = g9s.b(bundle, KEY_FRAME_TYPE);
            ckf.f(b, "getString(urlParams, KEY_FRAME_TYPE)");
            return b;
        }
        ckf.y(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        throw null;
    }

    public final String getAppId() {
        Bundle bundle = this.urlParams;
        if (bundle != null) {
            String b = g9s.b(bundle, APP_ID);
            ckf.f(b, "getString(urlParams, APP_ID)");
            return b;
        }
        ckf.y(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        throw null;
    }

    public final String getAppSubType() {
        Bundle bundle = this.urlParams;
        if (bundle != null) {
            String b = g9s.b(bundle, qxq.SUB_KEY_FRAGMENT_JUMP);
            ckf.f(b, "getString(urlParams, TMS…AppInfo.KEY_SUB_BIZ_TYPE)");
            return b;
        }
        ckf.y(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        throw null;
    }

    public final String getBizType() {
        Bundle bundle = this.urlParams;
        if (bundle != null) {
            String b = g9s.b(bundle, "bizType");
            ckf.f(b, "getString(urlParams, TMS…nts.AppInfo.KEY_BIZ_TYPE)");
            return b;
        }
        ckf.y(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        throw null;
    }

    public final String getContainerType() {
        Bundle bundle = this.urlParams;
        if (bundle != null) {
            String b = g9s.b(bundle, CONTAINER_TYPE);
            ckf.f(b, "getString(urlParams, CONTAINER_TYPE)");
            return b;
        }
        ckf.y(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        throw null;
    }

    public final JSONObject getExtraData() {
        return this.extraData;
    }

    public final boolean getFullScreen() {
        Bundle bundle = this.urlParams;
        if (bundle != null) {
            return g9s.a(bundle, "fullScreen", false);
        }
        ckf.y(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        throw null;
    }

    public final boolean getHideIndicator() {
        Bundle bundle = this.urlParams;
        if (bundle != null) {
            return g9s.a(bundle, "hideHomeIndicator", false);
        }
        ckf.y(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        throw null;
    }

    public final String getNBSVersion() {
        Bundle bundle = this.urlParams;
        if (bundle != null) {
            String b = g9s.b(bundle, NBSV);
            ckf.f(b, "getString(urlParams, NBSV)");
            return b;
        }
        ckf.y(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        throw null;
    }

    public final AppInfoScene getNBScene() {
        Bundle bundle = this.urlParams;
        if (bundle != null) {
            String b = g9s.b(bundle, NBSN);
            if (TextUtils.isEmpty(b)) {
                return AppInfoScene.ONLINE;
            }
            AppInfoScene[] values = AppInfoScene.values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                AppInfoScene appInfoScene = values[i];
                i++;
                if (tsq.x(appInfoScene.name(), b, true)) {
                    return appInfoScene;
                }
            }
            return AppInfoScene.DEBUG;
        }
        ckf.y(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        throw null;
    }

    public final String getNBSource() {
        Bundle bundle = this.urlParams;
        if (bundle != null) {
            String b = g9s.b(bundle, DEBUG_FLAG);
            if (TextUtils.isEmpty(b)) {
                b = "online";
            }
            ckf.f(b, "nbSource");
            return b;
        }
        ckf.y(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        throw null;
    }

    public final String getOpenModel() {
        String str = this.mUrl;
        if (str != null) {
            return configOpenMode(ies.g(str));
        }
        ckf.y("mUrl");
        throw null;
    }

    public final String getPageBgColor() {
        Bundle bundle = this.urlParams;
        if (bundle != null) {
            String b = g9s.b(bundle, KEY_PAGE_BG_COLOR);
            ckf.f(b, "getString(urlParams, KEY_PAGE_BG_COLOR)");
            return b;
        }
        ckf.y(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        throw null;
    }

    public final String getPageUrl() {
        Bundle bundle = this.urlParams;
        if (bundle != null) {
            String b = g9s.b(bundle, "page");
            ckf.f(b, "getString(urlParams, PAGE)");
            return b;
        }
        ckf.y(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        throw null;
    }

    public final String getSourceChannel() {
        Bundle bundle = this.urlParams;
        if (bundle != null) {
            return g9s.b(bundle, "miniappSourceChannel");
        }
        ckf.y(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        throw null;
    }

    public final String getStartUrl() {
        String str = this.mUrl;
        if (str != null) {
            return str;
        }
        ckf.y("mUrl");
        throw null;
    }

    public final String getUniAppId() {
        String j;
        ges.a mUniAppBaseInfo = getMUniAppBaseInfo();
        if (mUniAppBaseInfo == null || (j = mUniAppBaseInfo.j()) == null) {
            return "";
        }
        return j;
    }

    public final boolean isFragmentContainer() {
        return gbs.a(this.extraData, KEY_IS_FRAGMENT_CONTAINER, false);
    }

    public final boolean isMiniAppDebug() {
        Bundle bundle = this.urlParams;
        if (bundle != null) {
            if (bundle.containsKey(DEBUG_FLAG)) {
                Bundle bundle2 = this.urlParams;
                if (bundle2 == null) {
                    ckf.y(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
                    throw null;
                } else if (ckf.b("debug", g9s.b(bundle2, DEBUG_FLAG))) {
                    return true;
                }
            }
            return false;
        }
        ckf.y(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        throw null;
    }

    public final boolean isUniApp() {
        String str = this.mUrl;
        if (str != null) {
            return ges.m(ies.g(str));
        }
        ckf.y("mUrl");
        throw null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ckf.g(parcel, "parcel");
        Bundle bundle = this.urlParams;
        if (bundle != null) {
            parcel.writeBundle(bundle);
            Bundle bundle2 = this.mQuery;
            if (bundle2 != null) {
                parcel.writeBundle(bundle2);
                String str = this.mUrl;
                if (str != null) {
                    parcel.writeString(str);
                } else {
                    ckf.y("mUrl");
                    throw null;
                }
            } else {
                ckf.y("mQuery");
                throw null;
            }
        } else {
            ckf.y(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InstanceStartParams(Parcel parcel) {
        this();
        ckf.g(parcel, "parcel");
        Bundle readBundle = parcel.readBundle(InstanceStartParams.class.getClassLoader());
        if (readBundle != null) {
            this.urlParams = readBundle;
            Bundle readBundle2 = parcel.readBundle(InstanceStartParams.class.getClassLoader());
            if (readBundle2 != null) {
                this.mQuery = readBundle2;
                String readString = parcel.readString();
                this.mUrl = readString == null ? "" : readString;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Bundle");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.os.Bundle");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InstanceStartParams(String str, Bundle bundle, Bundle bundle2) {
        this();
        ckf.g(str, "url");
        ckf.g(bundle, RVConstants.EXTRA_START_PARAMS);
        ckf.g(bundle2, "query");
        this.urlParams = bundle;
        this.mQuery = bundle2;
        this.mUrl = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InstanceStartParams(String str, Bundle bundle, Bundle bundle2, JSONObject jSONObject) {
        this();
        ckf.g(str, "url");
        ckf.g(bundle, RVConstants.EXTRA_START_PARAMS);
        ckf.g(bundle2, "query");
        ckf.g(jSONObject, "extraData");
        this.urlParams = bundle;
        this.mQuery = bundle2;
        this.mUrl = str;
        this.extraData = jSONObject;
    }
}
