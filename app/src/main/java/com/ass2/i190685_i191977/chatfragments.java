package com.meshal.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class chatfragments extends AppCompatActivity {


        //in chatfragment.java
        final string retName = dataSnapshot.child("name").getValue().toString();
        final string retStatus = datasnapshot.child("statuss").getValue().toString() ;
        holder.userName.setText(retName);
        holder.userStatus.setText("Last Seen: " + "\n"+"Date"+"time");
        if (dataSnapshot.child("user.state").hasChild(s:"state"))
        {
            string state=datasnapshot.child("usrState").child("state").getValue().toString();
            string date=datasnapshot.child("usrState").child("date").getValue().toString();
            string time=datasnapshot.child("usrState").child("time").getValue().toString();
            if (status.equals("online"))
            {
                holder.userStatus.setText("online");
            }
            if (status.equals("offline"))
            {
                holder.userStatus.setText("Last Seen: " + "\n"+" Date"+" Time");;
            }

        }
        else
        {
            holder.userStatus.setText("offline");
        }

        //chatactivity.java
        private  void DisplayLastSeen()
        {
            RootRef.child("Users").child(messageSenderID).addValueEventListener(new ValueEventListener())
            {
                @ovveride
                        public void onDataChange(DataSnapshot datasnapshot)
                {
                    if (dataSnapshot.child("user.state").hasChild(s:"state"))
                    {
                        string state=datasnapshot.child("usrState").child("state").getValue().toString();
                        string date=datasnapshot.child("usrState").child("date").getValue().toString();
                        string time=datasnapshot.child("usrState").child("time").getValue().toString();
                        if (status.equals("online"))
                        {
                            userlastseen.setText("online");
                        }
                        if (status.equals("offline"))
                        {
                            userlastscene.setText("Last Seen: " + "\n"+" Date"+" Time");;
                        }

                    }
                    else
                    {
                        holder.userStatus.setText("offline");
                    }
                }
                @ovveride
                public void oncancelled(DatabaseError databaseError)
                {

                }

            }
        }

    }
}