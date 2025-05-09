package com.taobao.themis.external.embed;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import kotlin.Metadata;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/taobao/themis/external/embed/SinglePageStartParams;", "Lcom/taobao/themis/external/embed/StartParams;", "Ljava/io/Serializable;", "()V", "bgTransparent", "", "getBgTransparent", "()Ljava/lang/Boolean;", "setBgTransparent", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "themis_kernel_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class SinglePageStartParams extends StartParams implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Boolean bgTransparent;

    static {
        t2o.a(839909378);
    }

    public static /* synthetic */ Object ipc$super(SinglePageStartParams singlePageStartParams, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/external/embed/SinglePageStartParams");
    }

    public Boolean getBgTransparent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("9a25af1b", new Object[]{this});
        }
        return this.bgTransparent;
    }

    public void setBgTransparent(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd327c7b", new Object[]{this, bool});
        } else {
            this.bgTransparent = bool;
        }
    }
}
