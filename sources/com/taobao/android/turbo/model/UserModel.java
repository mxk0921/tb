package com.taobao.android.turbo.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/taobao/android/turbo/model/UserModel;", "", "<init>", "()V", "Lcom/taobao/android/turbo/model/UserModel$AvatarIcon;", "avatarIcon", "Lcom/taobao/android/turbo/model/UserModel$AvatarIcon;", "getAvatarIcon", "()Lcom/taobao/android/turbo/model/UserModel$AvatarIcon;", "setAvatarIcon", "(Lcom/taobao/android/turbo/model/UserModel$AvatarIcon;)V", "Companion", "AvatarIcon", "a", "turboflow_biz_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class UserModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private AvatarIcon avatarIcon;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/taobao/android/turbo/model/UserModel$AvatarIcon;", "", "<init>", "()V", "", "lightType", "Ljava/lang/String;", "getLightType", "()Ljava/lang/String;", "setLightType", "(Ljava/lang/String;)V", "lightValue", "getLightValue", "setLightValue", "Lcom/alibaba/fastjson/JSONObject;", "utParams", "Lcom/alibaba/fastjson/JSONObject;", "getUtParams", "()Lcom/alibaba/fastjson/JSONObject;", "setUtParams", "(Lcom/alibaba/fastjson/JSONObject;)V", "Companion", "a", "turboflow_biz_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class AvatarIcon {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final a Companion = new a(null);
        public static final String LIGHT_TYPE_RED_POINT = "redPoint";
        public static final String LIGHT_TYPE_TEXT = "text";
        private String lightType;
        private String lightValue;
        private JSONObject utParams;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class a {
            static {
                t2o.a(916455491);
            }

            public a() {
            }

            public /* synthetic */ a(a07 a07Var) {
                this();
            }
        }

        static {
            t2o.a(916455490);
        }

        public final String getLightType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bb31587f", new Object[]{this});
            }
            return this.lightType;
        }

        public final String getLightValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("952b9da8", new Object[]{this});
            }
            return this.lightValue;
        }

        public final JSONObject getUtParams() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("eaea70a2", new Object[]{this});
            }
            return this.utParams;
        }

        public final void setLightType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2d37733f", new Object[]{this, str});
            } else {
                this.lightType = str;
            }
        }

        public final void setLightValue(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("87319ece", new Object[]{this, str});
            } else {
                this.lightValue = str;
            }
        }

        public final void setUtParams(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("86fabc22", new Object[]{this, jSONObject});
            } else {
                this.utParams = jSONObject;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(916455492);
        }

        public a() {
        }

        public final UserModel a(Map<String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UserModel) ipChange.ipc$dispatch("1c37bf9e", new Object[]{this, map});
            }
            ckf.g(map, "data");
            if (!(map.get("avatarIcon") instanceof Map)) {
                return new UserModel();
            }
            UserModel userModel = new UserModel();
            Object obj = map.get("avatarIcon");
            if (obj != null) {
                userModel.setAvatarIcon((AvatarIcon) JSON.toJavaObject(new JSONObject((Map) obj), AvatarIcon.class));
                return userModel;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455489);
    }

    public final AvatarIcon getAvatarIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AvatarIcon) ipChange.ipc$dispatch("5fba195e", new Object[]{this});
        }
        return this.avatarIcon;
    }

    public final void setAvatarIcon(AvatarIcon avatarIcon) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dd5ee64", new Object[]{this, avatarIcon});
        } else {
            this.avatarIcon = avatarIcon;
        }
    }
}
