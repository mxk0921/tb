package com.taobao.umipublish.draft;

import com.alibaba.ability.localization.Localization;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface b {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        public static final String ERROR_CODE_DRAFT_DELETE_FAILED = "105";
        public static final String ERROR_CODE_DRAFT_LIMIT = "103";
        public static final String ERROR_CODE_DRAFT_MOVE_FAILED = "106";
        public static final String ERROR_CODE_DRAFT_SAVE_FAILED = "104";
        public static final String ERROR_CODE_INVALID_PAGE = "101";
        public static final String ERROR_CODE_INVALID_PARAM = "102";

        /* renamed from: a  reason: collision with root package name */
        public final DraftModel f13982a;
        public final int b;
        public final boolean c;
        public final String d;
        public final String e;
        public static final String ERROR_MSG_INVALID_PAGE = Localization.q(R.string.gg_pub_invalid_page_exclamation);
        public static final String ERROR_MSG_INVALID_PARAM = Localization.q(R.string.gg_pub_invalid_parameter);
        public static final String ERROR_MSG_DRAFT_LIMIT = Localization.q(R.string.gg_pub_draft_limit_reached);
        public static final String ERROR_MSG_DRAFT_SAVE_FAILED = Localization.q(R.string.gg_pub_draft_save_failed);
        public static final String ERROR_MSG_DRAFT_DELETE_FAILED = Localization.q(R.string.gg_pub_draft_delete_failed);
        public static final String ERROR_MSG_DRAFT_MOVE_FAILED = Localization.q(R.string.gg_pub_draft_transfer_failed);

        static {
            t2o.a(944767001);
        }

        public a(boolean z) {
            this.c = z;
        }

        public a(DraftModel draftModel, int i) {
            this.f13982a = draftModel;
            this.b = i;
            this.c = draftModel != null;
        }

        public a(String str, String str2) {
            this.f13982a = null;
            this.c = false;
            this.d = str;
            this.e = str2;
        }
    }
}
