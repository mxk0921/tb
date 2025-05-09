package com.alibaba.wireless.aliprivacy;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PrivacyAuthSetParam implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final List<PrivacyAuthParam> privacyAuthResultList;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final List<PrivacyAuthParam> f3385a = new ArrayList();

        public static /* synthetic */ List a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("c4c4c5fa", new Object[]{aVar});
            }
            return aVar.f3385a;
        }

        public a b(String str, Map<String, Boolean> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d89b13a4", new Object[]{this, str, map});
            }
            PrivacyAuthParam privacyAuthParam = new PrivacyAuthParam();
            privacyAuthParam.setSceneCode(str);
            privacyAuthParam.setPermissions(map);
            ((ArrayList) this.f3385a).add(privacyAuthParam);
            return this;
        }

        public PrivacyAuthSetParam c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PrivacyAuthSetParam) ipChange.ipc$dispatch("3e06b7e0", new Object[]{this});
            }
            return new PrivacyAuthSetParam(this);
        }

        public boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
            }
            return ((ArrayList) this.f3385a).isEmpty();
        }
    }

    private PrivacyAuthSetParam() {
        this(new a());
    }

    public List<PrivacyAuthParam> getAuthSetParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1c788296", new Object[]{this});
        }
        return this.privacyAuthResultList;
    }

    public PrivacyAuthSetParam(a aVar) {
        this.privacyAuthResultList = a.a(aVar);
    }
}
