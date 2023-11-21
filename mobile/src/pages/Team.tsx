import React from "react";
import { useParams } from "react-router-dom";

interface TeamParams {
  teamId: string;
}

const Team = () => {
  const { teamId } = useParams<TeamParams>();

  return <div>Team id: {teamId}</div>;
};

export default Team;
