package com.etao.feimagesearch.model;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.l53;
import tb.q5c;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface PhotoFrom {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a implements PhotoFrom {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f4784a;

        static {
            t2o.a(481297099);
            t2o.a(481297098);
        }

        public a(String str) {
            this.f4784a = str;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            String str = this.f4784a;
            String str2 = ((a) obj).f4784a;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
            return false;
        }

        @Override // com.etao.feimagesearch.model.PhotoFrom
        public String getArg() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8dd337d9", new Object[]{this});
            }
            return this.f4784a;
        }

        @Override // com.etao.feimagesearch.model.PhotoFrom
        public String getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
            }
            return this.f4784a;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            String str = this.f4784a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "CustomPhotoFrom{mValue='" + this.f4784a + "'}";
        }
    }

    String getArg();

    String getValue();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum Values implements PhotoFrom {
        ALBUM("album"),
        ALBUM_SYS("sao_album"),
        ALBUM_GARBAGE("album_garbage"),
        TAKE("take"),
        TAKE_SYS("sao_take"),
        TAKE_GARBAGE("take_garbage"),
        TAKE_SYS_GARBAGE("take_sao_garbage"),
        OPE("ope"),
        SYSTEM_ALBUM("system_album", "album"),
        MEDIA_IMAGE("media_image", "media_image"),
        PREVIEW("preview", "album"),
        SCAN("take"),
        CAPTURE_DETECT("capturedetect"),
        INTELLI_SYS("intellisys"),
        INTELLI_PLT("intelliplt"),
        HISTORY(q5c.HISTORY),
        SHOP("shop"),
        WIDGET("screen_widget"),
        AUTO_DETECT(l53.b.SCENE_AUTO_DETECT),
        META_SIGHT(l53.b.SCENE_META_SIGHT),
        SAO_PLT_AUTO_DETECT("sao_plt_autodetect"),
        VIDEO_SHOT("video_shot"),
        VIDEO_SEARCH("video_search"),
        FOOT_PRINT("recommend"),
        OUTER_ALBUM_REMOTE("outer_album_remote"),
        OUTER_ALBUM_LOCAL("outer_album_local"),
        SAO_AUTO_DETECT("sao_autodetect"),
        AUTO_DETECT_CARD("autodetect_card"),
        AUTO_DETECT_CARD_JUMP("autodetect_card_jump"),
        RESEARCH("PicSearchCard"),
        SSK_LOCAL("ssklocal"),
        SSK_REMOTE("sskremote"),
        LOGO("sys_logo"),
        PRODUCT_CODE("productCode"),
        SSK_HISTORY("sskhistory"),
        Got_CODE("gotcode"),
        FLOAT_BAR("floatbar"),
        OUTER_ALBUM_RESULT("outer_album_result"),
        TRANSLATE_TAKE("translate_take"),
        TRANSLATE_ALBUM("translate_album"),
        TRANSLATE_HISTORY("translate_history"),
        IDENTIFY_TAKE("identify_take"),
        IDENTIFY_ALBUM("identify_album"),
        IDENTIFY_HISTORY("identify_history"),
        CIRCLE_SEARCH("circle_search"),
        UNKNOWN("unknown");
        
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String LOG_TAG = "PhotoFrom";
        private final String mArg;
        private final String mValue;

        Values(String str) {
            this.mValue = str;
            this.mArg = str;
        }

        public static /* synthetic */ Object ipc$super(Values values, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/model/PhotoFrom$Values");
        }

        public static PhotoFrom parseValue(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PhotoFrom) ipChange.ipc$dispatch("23a11b0f", new Object[]{str});
            }
            if (TextUtils.isEmpty(str)) {
                return UNKNOWN;
            }
            Values[] values = values();
            for (int i = 0; i < values.length; i++) {
                if (str.equals(values[i].getValue())) {
                    return values[i];
                }
            }
            return new a(str);
        }

        public static Values valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Values) ipChange.ipc$dispatch("bdc7cceb", new Object[]{str});
            }
            return (Values) Enum.valueOf(Values.class, str);
        }

        @Override // com.etao.feimagesearch.model.PhotoFrom
        public String getArg() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8dd337d9", new Object[]{this});
            }
            return this.mArg;
        }

        @Override // com.etao.feimagesearch.model.PhotoFrom
        public String getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
            }
            return this.mValue;
        }

        Values(String str, String str2) {
            this.mValue = str;
            this.mArg = str2;
        }
    }
}
