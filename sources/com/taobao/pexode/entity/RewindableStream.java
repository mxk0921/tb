package com.taobao.pexode.entity;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class RewindableStream extends InputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mInputType;

    static {
        t2o.a(618659881);
    }

    public RewindableStream(int i) {
        this.mInputType = i;
    }

    public static /* synthetic */ Object ipc$super(RewindableStream rewindableStream, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/pexode/entity/RewindableStream");
    }

    public void back2StreamType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4310576c", new Object[]{this});
        } else {
            this.mInputType = 3;
        }
    }

    public abstract byte[] getBuffer();

    public abstract int getBufferLength();

    public abstract int getBufferOffset();

    public abstract FileDescriptor getFD();

    public final int getInputType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b38bf4e8", new Object[]{this})).intValue();
        }
        return this.mInputType;
    }

    public void resetInputType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a95742e7", new Object[]{this, new Integer(i)});
        } else {
            this.mInputType = i;
        }
    }

    public abstract void rewind() throws IOException;

    public abstract void rewindAndSetBufferSize(int i) throws IOException;
}
