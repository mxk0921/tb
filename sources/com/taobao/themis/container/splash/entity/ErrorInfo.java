package com.taobao.themis.container.splash.entity;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ErrorInfo {

    /* renamed from: a  reason: collision with root package name */
    public boolean f13498a = false;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum buttonActionType {
        refresh("refresh"),
        back("back"),
        update("update");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String mAction;

        buttonActionType(String str) {
            this.mAction = str;
        }

        public static /* synthetic */ Object ipc$super(buttonActionType buttonactiontype, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/container/splash/entity/ErrorInfo$buttonActionType");
        }

        public static buttonActionType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (buttonActionType) ipChange.ipc$dispatch("362689f4", new Object[]{str});
            }
            return (buttonActionType) Enum.valueOf(buttonActionType.class, str);
        }

        public String getAction() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e81f414d", new Object[]{this});
            }
            return this.mAction;
        }
    }

    static {
        t2o.a(835715164);
    }
}
