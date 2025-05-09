package com.taobao.android.interactive_sdk;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.interactive_sdk.adapter.ILikeAdapter$ErrorType;
import com.taobao.avplayer.DWNetworkAdapter;
import com.taobao.avplayer.core.model.DWRequest;
import com.taobao.social.sdk.net.ISocialBusinessListener;
import java.util.HashMap;
import mtopsdk.mtop.domain.MtopResponse;
import tb.hkc;
import tb.ltb;
import tb.s8q;
import tb.wu4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public enum LikeAdapter {
    INSTANCE;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements ISocialBusinessListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ hkc f8122a;

        public a(LikeAdapter likeAdapter, hkc hkcVar) {
            this.f8122a = hkcVar;
        }

        @Override // com.taobao.social.sdk.net.ISocialBusinessListener
        public void onError(ISocialBusinessListener.ErrorType errorType, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b26a5e33", new Object[]{this, errorType, str, str2});
            } else {
                this.f8122a.onError(ILikeAdapter$ErrorType.valueOf(errorType.name()), str, str2);
            }
        }

        @Override // com.taobao.social.sdk.net.ISocialBusinessListener
        public void onSuccess(MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eb9888c", new Object[]{this, mtopResponse, obj});
            } else {
                this.f8122a.onSuccess(mtopResponse, obj);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements ISocialBusinessListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ hkc f8123a;

        public b(LikeAdapter likeAdapter, hkc hkcVar) {
            this.f8123a = hkcVar;
        }

        @Override // com.taobao.social.sdk.net.ISocialBusinessListener
        public void onError(ISocialBusinessListener.ErrorType errorType, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b26a5e33", new Object[]{this, errorType, str, str2});
            } else {
                this.f8123a.onError(ILikeAdapter$ErrorType.valueOf(errorType.name()), str, str2);
            }
        }

        @Override // com.taobao.social.sdk.net.ISocialBusinessListener
        public void onSuccess(MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eb9888c", new Object[]{this, mtopResponse, obj});
            } else {
                this.f8123a.onSuccess(mtopResponse, obj);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements ISocialBusinessListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ hkc f8124a;

        public c(LikeAdapter likeAdapter, hkc hkcVar) {
            this.f8124a = hkcVar;
        }

        @Override // com.taobao.social.sdk.net.ISocialBusinessListener
        public void onError(ISocialBusinessListener.ErrorType errorType, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b26a5e33", new Object[]{this, errorType, str, str2});
            } else {
                this.f8124a.onError(ILikeAdapter$ErrorType.valueOf(errorType.name()), str, str2);
            }
        }

        @Override // com.taobao.social.sdk.net.ISocialBusinessListener
        public void onSuccess(MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eb9888c", new Object[]{this, mtopResponse, obj});
            } else {
                this.f8124a.onSuccess(mtopResponse, obj);
            }
        }
    }

    public void cancelDislike(String str, String str2, ltb ltbVar) {
        DWRequest dWRequest = new DWRequest();
        dWRequest.apiName = "mtop.taobao.social.dislike.remove";
        dWRequest.apiVersion = "1.0";
        dWRequest.needLogin = true;
        if (dWRequest.paramMap == null) {
            dWRequest.paramMap = new HashMap();
        }
        dWRequest.paramMap.put("namespace", String.valueOf(str));
        dWRequest.paramMap.put("targetId", String.valueOf(str2));
        new DWNetworkAdapter().sendRequest(ltbVar, dWRequest);
    }

    public void cancelLike(long j, long j2, hkc hkcVar) {
        s8q.getInstance().cancelLike(j, j2, new c(this, hkcVar));
    }

    public void checkLikeState(long j, long j2, hkc hkcVar) {
        s8q.getInstance().getCountAndStatus(new wu4(new wu4.a().setTargetIds(new String[]{String.valueOf(j)}).setLikeNamespace(j2).setLikeCount(true).setLikeStatus(true)), new a(this, hkcVar));
    }

    public void dislike(String str, String str2, String str3, ltb ltbVar) {
        DWRequest dWRequest = new DWRequest();
        dWRequest.apiName = "mtop.taobao.social.dislike.add";
        dWRequest.apiVersion = "1.0";
        dWRequest.needLogin = true;
        if (dWRequest.paramMap == null) {
            dWRequest.paramMap = new HashMap();
        }
        dWRequest.paramMap.put("namespace", String.valueOf(str));
        dWRequest.paramMap.put("targetId", String.valueOf(str2));
        new DWNetworkAdapter().sendRequest(ltbVar, dWRequest);
    }

    public void like(long j, long j2, String str, hkc hkcVar) {
        s8q.getInstance().like(j, j2, str, new b(this, hkcVar));
    }
}
