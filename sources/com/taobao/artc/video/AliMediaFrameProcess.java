package com.taobao.artc.video;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.ArtcVideoLayout;
import java.nio.ByteBuffer;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class AliMediaFrameProcess {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum TextureType {
        ORI_TEXTURE,
        MIX_TEXTURE,
        SCALE_TEXTURE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(TextureType textureType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/artc/video/AliMediaFrameProcess$TextureType");
        }

        public static TextureType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TextureType) ipChange.ipc$dispatch("bbdfbea3", new Object[]{str});
            }
            return (TextureType) Enum.valueOf(TextureType.class, str);
        }
    }

    static {
        t2o.a(395313316);
    }

    public AliMediaFrameProcess(Context context, int i, int i2) {
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92077f9d", new Object[]{this, new Boolean(z)});
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7def2447", new Object[]{this})).intValue();
        }
        return 0;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("16d4885a", new Object[]{this})).intValue();
        }
        return 0;
    }

    public int d(TextureType textureType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3d07d84", new Object[]{this, textureType})).intValue();
        }
        return 0;
    }

    public int e(int i, int i2, int i3, float[] fArr, ByteBuffer[] byteBufferArr, int[] iArr, int i4, int i5, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a386aea2", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), fArr, byteBufferArr, iArr, new Integer(i4), new Integer(i5), new Boolean(z)})).intValue();
        }
        return 0;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        }
    }

    public void g(ArtcVideoLayout artcVideoLayout, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c49e3", new Object[]{this, artcVideoLayout, new Integer(i), new Integer(i2)});
        }
    }

    public void h(byte[] bArr, int i, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5837e2e", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
        }
    }
}
