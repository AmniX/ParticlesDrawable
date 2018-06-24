/*
 * Copyright (C) 2017 Yaroslav Mytkalyk
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.doctoror.particlesdrawable.demo;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

import com.doctoror.particlesdrawable.ParticlesDrawable;

public final class DemoActivity extends Activity {

    private ParticlesDrawable mDrawable;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            mDrawable = (ParticlesDrawable) getDrawable(R.drawable.particles_customized);
        } else {
            mDrawable = new ParticlesDrawable();
        }
        //noinspection deprecation
        findViewById(android.R.id.content).setBackgroundDrawable(mDrawable);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mDrawable.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mDrawable.stop();
    }
}
